package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.entity.Comment;
import com.prueba.entity.Post;
import com.prueba.service.CommentServiceImp;
import com.prueba.service.PostServiceImp;

@RestController
@RequestMapping("/Home")
public class Controller {
	
	@Autowired
	private CommentServiceImp commentServiceImp;
	
	@Autowired
	private PostServiceImp postServiceImp;
	
	@GetMapping("/Comments")
	public List<Comment> comments(){
		return commentServiceImp.comments();
	}
	
	@GetMapping("/Post")
	public List<Post> posts(){
		return postServiceImp.posts();
	}
	
	@PostMapping("/Comments")
	public Comment ingresoComment(@RequestBody Comment comment) {
		return commentServiceImp.ingresoComment(comment);
	}
	
	@PostMapping("/Post")
	public Post ingresoPost(@RequestBody Post post) {
		return postServiceImp.ingresoPost(post);
	}

}
