package com.example.libraryapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libraryapplication.Domain.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
Student findByStudentnameAndPassword(String studentname,String  password);
}
