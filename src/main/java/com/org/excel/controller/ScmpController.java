package com.org.excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.excel.service.ScmpService;


@RestController
public class ScmpController {
	
	@Autowired
	ScmpService scmpService;
	
	
	@GetMapping("/version/{scmpNumber}")
	public  Long  getScmpVersion(@PathVariable String scmpNumber) {
		scmpService.initialize();
		Long versionNumber=scmpService.get(scmpNumber);
		return versionNumber;
		
	}
	
	
	@PutMapping("/version/{scmpNumber}/{versionNumber}")
	public boolean verifyScmpVersion(@PathVariable String scmpNumber, @PathVariable Long versionNumber) {
	    Long v=scmpService.insert(scmpNumber, versionNumber);
	    System.out.println(v);
		return true;
	}

}
