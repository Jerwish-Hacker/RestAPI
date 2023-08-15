package com.jerwish.FireBlade.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerwish.FireBlade.models.Instructor;
import com.jerwish.FireBlade.repository.InstructorRepo;
import com.jerwish.FireBlade.service.InstructorService;

@Service

public class InstructorServiceImpl implements InstructorService{
	@Autowired
	public InstructorRepo instructorRepository;
	
	@Override
	public Instructor addinstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}
	@Override
	public List<Instructor> getinstructor() {
		return instructorRepository.findAll();
	}
	

	
}
