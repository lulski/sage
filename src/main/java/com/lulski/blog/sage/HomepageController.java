package com.lulski.blog.sage;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * blablba.
 */
@RestController
public class HomepageController {

  @RequestMapping("/greeting")
  public String greeting(@RequestParam(name = "name", required = false,
                            defaultValue = "world") String name) {
    return "greeting";
  }

}
