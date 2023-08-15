package com.jerwish.FireBlade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jerwish.FireBlade.models.Instructor;

@Repository


public interface InstructorRepo extends JpaRepository<Instructor, Long>{

}
