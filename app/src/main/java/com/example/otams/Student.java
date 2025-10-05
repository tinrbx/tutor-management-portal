package com.example.otams;

public class Student extends User{

    private String program;

    public Student(String firstName, String lastName, String email, String password, String phone, String program){
        super(firstName, lastName, email, password, phone, "Student");
        this.program = program;
    }
}
