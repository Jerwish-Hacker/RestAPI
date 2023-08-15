package com.jerwish.FireBlade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jerwish.FireBlade.models.Instructor;
import com.jerwish.FireBlade.service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

	@Autowired
	public InstructorService instructorservice;
	
	@PostMapping("/addinstructor")
	public Instructor addInstructor(@RequestBody Instructor instructor) {
		return instructorservice.addinstructor(instructor);
	}

	@GetMapping("/getinstructor")
	public List<Instructor> getinstructor() {
		return instructorservice.getinstructor();
	}

}
