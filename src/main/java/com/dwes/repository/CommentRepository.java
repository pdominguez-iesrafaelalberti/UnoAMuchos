package com.dwes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
