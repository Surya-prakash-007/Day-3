package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repo.DBREPO;

@Service
public class StudentService {
     @Autowired     
     private DBREPO stu;
     
     public Student savedetails(Student s)
     {
    	 return stu.save(s);
     }
     
     public List<Student> getAllDetails()
     {
    	 List<Student> arr = new ArrayList<>();
    	 arr=stu.findAll();
    	 return arr;
//    	 return stu.findAll() ;   
    	 }
     public void deleteDepartmentById(int id)
     {
    	 stu.deleteById(id);
     }
}