package com.example.libraryapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryapplication.Domain.Student;
import com.example.libraryapplication.Repository.StudentRepository;

@Controller 
public class LoginController {
    @Autowired
    StudentRepository repo;
@GetMapping ("\signin")
public String showloginpage(){
    return "login.html";
}
@PostMapping ("\signin")
public String Login(@RequestParam String studentname,@RequestParam String password){
    Student entity = repo.findByStudentnameAndPassword(studentname,password);
    

}
}
