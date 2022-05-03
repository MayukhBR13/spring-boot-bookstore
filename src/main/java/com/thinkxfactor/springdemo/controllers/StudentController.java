package com.thinkxfactor.springdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.thinkxfactor.springdemo.entity.Student;
import com.thinkxfactor.springdemo.repositary.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    //private ArrayList<Student> students=new ArrayList<Student>();


    @GetMapping("/")
    List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/addStudent")
    String addStudent(@RequestBody Student stu){
        Student pStu=studentRepository.save(stu);
    //    students.add(pStu);
        return pStu.toString();
    }

    @GetMapping("/id")
    String getStudentById(@RequestParam Long id){
        Optional<Student> s=studentRepository.findById(id);
        return (s.isPresent())?s.get().toString():"not present";

    }

    @DeleteMapping("/deleteId/{id}")
    String deleteStudent(@PathVariable int id){
        System.out.println(id+"jiiiiiiiii");
        try{
            studentRepository.deleteById((long)id);
        }catch(Exception e){
            return "Oppppppppppps";
        }
        return "nooooooooooooooooooooo";
    }

    @GetMapping("/name")
    String getStudentByName(@RequestParam String name){

        Student s=studentRepository.findByName(name);
        return s.toString();

    }
    
}
