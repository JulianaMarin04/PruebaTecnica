package com.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}