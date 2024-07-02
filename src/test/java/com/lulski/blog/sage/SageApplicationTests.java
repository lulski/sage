package com.lulski.blog.sage;

import java.util.Date;

import com.lulski.blog.sage.post.Post;
import com.lulski.blog.sage.post.PostRepository;
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

		Post newPost1 = new Post("Ichsan Siswoputranto", "body", "icky", date);

		repository.save(newPost);
		repository.save(newPost1);
	}

}
