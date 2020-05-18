package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Comment;
import com.prueba.repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService {

	@Autowired
	CommentRepository repositorioComment;

	@Override
	public Comment ingresoComment(Comment comment) {
		return repositorioComment.save(comment);
	}

	@Override
	public List<Comment> comments() {
		return repositorioComment.findAll();
	}
	
	
}
