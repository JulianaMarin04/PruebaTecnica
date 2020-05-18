package com.prueba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.entity.ApicallHistory;


@Service
public interface ApicallHistoryService {
	
	public List<ApicallHistory> history();

}
