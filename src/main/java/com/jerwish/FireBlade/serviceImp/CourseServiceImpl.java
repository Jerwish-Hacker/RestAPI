package com.jerwish.FireBlade.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerwish.FireBlade.models.Course;
import com.jerwish.FireBlade.repository.CourseRepo;
import com.jerwish.FireBlade.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepo courseRepository;
	
	@Override
	public Course addcourse(Course course) {
		return courseRepository.save(course);
	}
	@Override
	public List<Course> getcourse() {
		return courseRepository.findAll();
	}

	
}
