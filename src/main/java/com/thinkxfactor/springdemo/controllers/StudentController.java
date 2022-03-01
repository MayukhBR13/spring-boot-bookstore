package com.thinkxfactor.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.thinkxfactor.springdemo.entity.Student;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    private ArrayList<Student> students=new ArrayList<Student>();


    @GetMapping("/")
    ArrayList<Student> getAllStudents(){
        return students;
    }

    @PostMapping("/addStudent")
    String addStudent(@RequestBody Student stu){
        students.add(stu);
        return stu.toString();
    }

    @GetMapping("/roll")
    String getStudentByRoll(@RequestParam int roll){
        int i=0,len=students.size();
        for(;i<len;i++)
            if(students.get(i).getRoll()==roll)break;
        if(i==len)
            return "<h1>Student with Roll no.: "+roll+" not found</h1>";
        return students.get(i).toString();

    }

    @GetMapping("/deleteId/{id}")
    String deleteStudent(@PathVariable int id){
        int i=0,len=students.size();
        for(;i<len;i++)
            if(students.get(i).getId()==id)break;
        if(i==len)
            return "<h1>Student with Id:"+id+" not found</h1>";
        return students.remove(i).toString();
    }

    
}
