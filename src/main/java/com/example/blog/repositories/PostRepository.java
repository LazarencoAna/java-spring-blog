package com.example.blog.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
