package com.prueba.service;

import java.util.List;

import com.prueba.entity.Post;

public interface PostService {

	public Post ingresoPost(Post post);

	public List<Post> posts();

}
