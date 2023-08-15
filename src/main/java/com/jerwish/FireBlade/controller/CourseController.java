package com.jerwish.FireBlade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jerwish.FireBlade.models.Course;
import com.jerwish.FireBlade.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseservice;
	
	@PostMapping("/addcourse")
	public Course addcourse(@RequestBody Course course) {
		return courseservice.addcourse(course);
	}
	
	@GetMapping("/getcourse")
	public List<Course> getcourse() {
		return courseservice.getcourse();
	}



}
