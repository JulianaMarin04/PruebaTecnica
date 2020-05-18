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

@RestController
@RequestMapping("/HomeComment")
public class ControllerComment {
	
	@Autowired
	private CommentServiceImp commentServiceImp;
	
	
	@GetMapping("/Comments")
	public List<Comment> comments(){
		return commentServiceImp.comments();
	}
	
	@PostMapping("/Comments")
	public Comment ingresoComment(@RequestBody Comment comment) {
		return commentServiceImp.ingresoComment(comment);
	}

	

}
