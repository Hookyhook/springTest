package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ResourceController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public Optional<Student> getStudent(@RequestParam(name = "id") int id){
        return studentRepository.findById(id);
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}