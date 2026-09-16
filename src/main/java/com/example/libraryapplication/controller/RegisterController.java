package com.example.libraryapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.libraryapplication.Domain.Student;
import com.example.libraryapplication.Repository.StudentRepository;

@RequestMapping("/signup")
@Controller
public class RegisterController {
    final StudentRepository repo;

    @SuppressWarnings("unused")
  RegisterController(StudentRepository repo) {
    this.repo = repo;
  }
@GetMapping
public String DisplaySignup() {
    return "register.html";
}
@PostMapping
public String signup(@ModelAttribute Student student) {
    repo.save(student);
    return "redirect:/index.html";
}

}
