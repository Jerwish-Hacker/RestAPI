package com.jerwish.FireBlade.service;

import java.util.List;

import com.jerwish.FireBlade.models.Instructor;

public interface InstructorService {
	Instructor addinstructor(Instructor instructor);
	List<Instructor> getinstructor();
}
