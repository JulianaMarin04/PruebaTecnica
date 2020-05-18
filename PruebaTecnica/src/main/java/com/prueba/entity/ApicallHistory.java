package com.prueba.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ApicallHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column
	private String type;

	@Column
	private Date callDate;

	public ApicallHistory(String type, Date callDate) {
		super();
		this.type = type;
		this.callDate = callDate;
	}
	
	
	public ApicallHistory() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getCallDate() {
		return callDate;
	}


	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}


	@Override
	public String toString() {
		return "ApicallHistory [id=" + id + ", type=" + type + ", callDate=" + callDate + "]";
	}
	
	


}
