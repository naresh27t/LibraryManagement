package com.example.libraryapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    Student entity = repo.findByStudentnameAndPassword(student,password)

}
}
