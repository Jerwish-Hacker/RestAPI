package com.jerwish.FireBlade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jerwish.FireBlade.models.Course;

@Repository


public interface CourseRepo extends JpaRepository<Course, Long>{

}
