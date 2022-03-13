package com.thinkxfactor.springdemo.repositary;

import com.thinkxfactor.springdemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,Long>{
    Student findByName(String name);
}
