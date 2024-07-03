

package com.lulski.blog.sage.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//https://www.javaguides.net/2019/08/spring-boot-spring-data-jpa-postgresql-example.html
//tutorial

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id) throws UserNotFoundException {
        User user = userRepository.findById(id).
                orElseThrow(() -> new UserNotFoundException("User with ID: " + id + " doesn't exist"));

        return ResponseEntity.ok().body(user);

    }

    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user){
         return userRepository.save(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value="id") Long userId,
                                           @Valid @RequestBody User userDetails) throws UserNotFoundException{
        User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("" +
                "User with ID: "+userId+" doesn't exist"));

        user.setEmail(userDetails.getEmail());
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());

        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/user/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value="id") long userId) throws  UserNotFoundException{
       //Optional<User>  user  = userRepository.findById(userId);
        User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("" +
                "User with ID: "+userId+" doesn't exist"));

//       user.ifPresent(u -> System.out.println(u.toString()) );
//       user.

        userRepository.delete(user);



        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
