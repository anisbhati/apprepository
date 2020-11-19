package com.example.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.edu.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
