package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.entity.ApicallHistory;
import com.prueba.service.ApicallHistoryServiceImp;

@RestController
@RequestMapping("/HomeHistory")
public class ControllerApicallHistory {
	
	@Autowired
	private ApicallHistoryServiceImp apicallHistortServiceImp;
	
	@GetMapping("/History")
	public List<ApicallHistory> history(){
		return apicallHistortServiceImp.history();
	}

}
