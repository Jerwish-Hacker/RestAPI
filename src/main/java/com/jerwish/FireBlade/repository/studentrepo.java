package com.jerwish.FireBlade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jerwish.FireBlade.models.student;

@Repository
public interface studentrepo  extends JpaRepository<student, Long>{

}
