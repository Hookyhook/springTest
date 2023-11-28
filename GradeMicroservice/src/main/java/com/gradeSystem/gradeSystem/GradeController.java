package com.gradeSystem.gradeSystem;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/grade")
class GradeController{


    GradeRepository gradeRepository;
    @PostMapping
    public Grade postGrade(@RequestBody Grade grade){
        return gradeRepository.save(grade);
    }

    @GetMapping("/{id}")
    public Optional<Grade> getGradeByID(@PathVariable Integer id){
        return gradeRepository.findById(id);
    }

    @GetMapping
    public List<Grade> getGrades(){
        return gradeRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteGradeByID(@PathVariable Integer id){
        gradeRepository.deleteById(id);
    }
}