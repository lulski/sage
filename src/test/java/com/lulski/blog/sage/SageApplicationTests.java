package com.lulski.blog.sage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SageApplicationTests {

	@Autowired
	private PostRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void testAddingBlogPost() {
		repository.deleteAll();

		Date date = new Date();
		Post newPost = new Post("Ichsan Siswoputranto", "body", "icky", date);

		repository.save(newPost);
	}

}
