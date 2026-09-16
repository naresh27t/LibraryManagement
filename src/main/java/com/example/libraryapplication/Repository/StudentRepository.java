package com.example.libraryapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryapplication.Domain.Student;


@Repository 
public interface StudentRepository extends JpaRepository<Student, Long> {
Student findByStudentNameAndPassword(String studentname,String  password);
}
