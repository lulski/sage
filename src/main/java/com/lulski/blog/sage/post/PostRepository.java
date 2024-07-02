package com.lulski.blog.sage.post;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {

  public Optional<Post> findById(String id);

  public List<Post> findByAuthor(String author);

}
