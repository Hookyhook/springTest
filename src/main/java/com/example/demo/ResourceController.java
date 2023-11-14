package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class ResourceController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudent(@RequestParam(name = "id", required = false) Integer id){
        if(id != null){
            return List.of(studentRepository.findById(id).orElse(null));
        }
        return  studentRepository.findAll();
    }


    @PostMapping
    public Student postStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}