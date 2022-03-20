package com.lulski.blog.sage;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

  public Optional<Post> findById(String id);

  public List<Post> findByAuthor(String author);

}
