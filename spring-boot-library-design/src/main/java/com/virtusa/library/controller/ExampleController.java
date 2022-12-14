package com.virtusa.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.library.model.GreatLearning;
import com.virtusa.library.service.ExampleService;

import io.swagger.annotations.ApiOperation;

//@Controller
@RestController
public class ExampleController {
	
	@Autowired
	ExampleService exampleService;
	
	@ApiOperation(value = "Provides information about this course")
	@GetMapping("/info")
	// @ResponseBody
	public GreatLearning get() {
		return exampleService.get();
	}
	
	@ApiOperation(value = "Allows you to customize information about a course")
	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String firstName, String lastname) {
		return exampleService.customInfo(courseName, courseType, firstName, lastname );
	}

}
