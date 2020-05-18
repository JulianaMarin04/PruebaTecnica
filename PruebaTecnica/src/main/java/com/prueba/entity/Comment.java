package com.prueba.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Comment {
	
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column
	private String name;

	@Column
	private String email;
	
	@Column
	private String body;
	
	@ManyToOne
    private Post postId;

	public Comment(String name, String email, String body) {
		super();
		this.name = name;
		this.email = email;
		this.body = body;
	}
	
	public Comment() {
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", email=" + email + ", body=" + body + "]";
	}
	

	

	

	
	
	
	



}
