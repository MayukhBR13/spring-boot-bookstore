package com.thinkxfactor.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.thinkxfactor.springdemo.entity.Admin;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private ArrayList<Admin> admins=new ArrayList<Admin>();


    @GetMapping("/")
    ArrayList<Admin> getAllAdmins(){
        return admins;
    }

    @PostMapping("/addAdmin")
    String addAdmin(@RequestBody Admin stu){
        admins.add(stu);
        return stu.toString();
    }

    @GetMapping("/id")
    String getAdminById(@RequestParam int id){
        int i=0,len=admins.size();
        for(;i<len;i++)
            if(admins.get(i).getId()==id)break;
        if(i==len)
            return "<h1>Admin with Id no.: "+id+" not found</h1>";
        return admins.get(i).toString();

    }

    @GetMapping("/deleteId/{id}")
    String deleteAdmin(@PathVariable int id){
        int i=0,len=admins.size();
        for(;i<len;i++)
            if(admins.get(i).getId()==id)break;
        if(i==len)
            return "<h1>Admin with Id:"+id+" not found</h1>";
        return admins.remove(i).toString();
    }

    
}
