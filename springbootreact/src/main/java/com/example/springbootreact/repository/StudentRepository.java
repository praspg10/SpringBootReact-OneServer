package com.example.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootreact.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {}
