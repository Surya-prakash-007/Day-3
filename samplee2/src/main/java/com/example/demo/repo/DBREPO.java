package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface DBREPO extends JpaRepository<Student,Integer>{

}