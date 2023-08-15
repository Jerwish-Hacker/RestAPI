package com.jerwish.FireBlade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jerwish.FireBlade.models.student;
import com.jerwish.FireBlade.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addstudent")
	public student addstudent(@RequestBody student student) {
		return studentservice.addstudent(student);
	}
	
	@GetMapping("/getstudent")
	public List<student> getstudent() {
		return studentservice.getstudent();
	}
}
