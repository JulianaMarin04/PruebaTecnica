package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
