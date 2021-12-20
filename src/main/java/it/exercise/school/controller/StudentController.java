package it.exercise.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.exercise.school.repository.StudentRepository;
@Controller
public class StudentController {
   
    
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository){

        this.studentRepository=studentRepository;
    }
    
    @GetMapping("/students")
    public String getClasses(Model model){

        model.addAttribute("students",studentRepository.findAll());

        


        return "students";
    }

}
