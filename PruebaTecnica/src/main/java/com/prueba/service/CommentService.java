package com.prueba.service;

import java.util.List;

import com.prueba.entity.Comment;

public interface CommentService {
	
	public Comment ingresoComment(Comment comment);
	
	public List<Comment> comments();

}
