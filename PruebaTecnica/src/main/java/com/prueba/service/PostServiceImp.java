package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Post;
import com.prueba.repository.PostRepository;

@Service
public class PostServiceImp implements PostService{

	@Autowired
	PostRepository repositorioPost;
	
	@Override
	public Post ingresoPost(Post post) {
		return repositorioPost.save(post);
	}

	@Override
	public List<Post> posts() {
		return repositorioPost.findAll();
	}

}
