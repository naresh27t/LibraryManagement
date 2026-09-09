package com.example.libraryapplication.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="librarymanagement")
public class Student{
@Id 
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long id;
private String StudentName;
private String Password;
private String Book;
private int  Fee;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getStudentName() {
    return StudentName;
}
public void setStudentName(String studentName) {
    StudentName = studentName;
}
public String getPassword() {
    return Password;
}
public void setPassword(String password) {
    Password = password;
}
public String getBook() {
    return Book;
}
public void setBook(String book) {
    Book = book;
}
public int getFee() {
    return Fee;
}
public void setFee(int fee) {
    Fee = fee;
}

}