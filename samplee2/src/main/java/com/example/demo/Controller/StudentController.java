package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {	
	
    @Autowired
    private StudentService stuservice;
    
    @GetMapping("/getStudent")
    public List<Student> getDetails()
    {
    	return stuservice.getAllDetails();
    }
    
    @PostMapping("/addStudent")
    public Student addDetails(@RequestBody Student s)
    {
    	return stuservice.savedetails(s);
    	
    }
    
}