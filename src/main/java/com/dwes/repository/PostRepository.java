package com.dwes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
