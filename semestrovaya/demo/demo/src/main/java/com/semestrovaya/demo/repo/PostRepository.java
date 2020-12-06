package com.semestrovaya.demo.repo;

import com.semestrovaya.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
