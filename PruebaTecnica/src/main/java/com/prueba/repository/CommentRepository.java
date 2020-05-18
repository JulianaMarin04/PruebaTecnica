package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
