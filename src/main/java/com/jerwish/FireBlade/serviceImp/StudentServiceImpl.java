package com.jerwish.FireBlade.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerwish.FireBlade.models.student;
import com.jerwish.FireBlade.repository.studentrepo;
import com.jerwish.FireBlade.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private studentrepo studentRepository;
	
	@Override
	public 	student addstudent(student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<student> getstudent() {
		return studentRepository.findAll();
	}

}
