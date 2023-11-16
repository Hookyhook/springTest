package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class ResourceController {


    StudentRepository studentRepository;


    @GetMapping("/{id}")
    public Optional<Student> getByID(@PathVariable Integer id){
        return studentRepository.findById(id);
    }

    @GetMapping
    public  List<Student> getAll(){
        return studentRepository.findAll();
    }

    @PostMapping
    public Student post(@RequestBody Student student){
        return studentRepository.save(student);
    }
}