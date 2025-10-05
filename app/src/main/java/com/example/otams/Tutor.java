package com.example.otams;

public class Tutor extends User{

    private String degree;
    private String courses;


    public Tutor(String firstName, String lastName, String email, String password, String phone, String degree, String courses){
        super(firstName, lastName, email, password, phone, "Tutor");
        this.degree = degree;
        this.courses = courses;
    }


}
