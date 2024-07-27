package com.lulski.blog.sage.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserControllerTest {

  @Autowired
  private UserController userController;

  @MockBean
  private UserRepository userRepository;

  @Autowired
  private MockMvc mockMvc;

  @Test
  void contextLoads() throws Exception {
    assertThat(userController).isNotNull();


  }

  @Test
  void getAllUsers() {
  }

  @Test
  void getUserById() {
  }

  @Test
  void createUser() {
  }

  @Test
  void updateUser() {
  }

  @Test
  void deleteUser() {
  }
}