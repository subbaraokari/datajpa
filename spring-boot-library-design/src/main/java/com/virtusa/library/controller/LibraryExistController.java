package com.virtusa.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.library.service.LibraryExistService;

@RestController
@RequestMapping("/existService")
public class LibraryExistController {

	@Autowired
	LibraryExistService existService;
	
	@GetMapping("/checkLibraryExistsById")
	public boolean checkLibraryExistsById(Long id) {
		return existService.checkLibraryExistsById(id);
	}
	
	@GetMapping("/checkLibraryExistsByExample")
	public boolean checkLibraryExistsByExample(String commaSeperatedBookNames) {
		return existService.checkLibraryExistsByExample(commaSeperatedBookNames);
	}
	
}
