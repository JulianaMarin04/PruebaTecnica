package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.ApicallHistory;
import com.prueba.repository.ApicallHistoryRepository;


@Service
public class ApicallHistoryServiceImp implements ApicallHistoryService {

	@Autowired
	ApicallHistoryRepository repositorioApicallHistory;
	
	@Override
	public List<ApicallHistory> history() {
		return repositorioApicallHistory.findAll();
	}
}
