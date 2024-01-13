package com.example.StudentMS.repository;

import java.util.List;

//StudentRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
}

