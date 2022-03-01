package com.thinkxfactor.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.thinkxfactor.springdemo.entity.Book;

import java.util.ArrayList;

@RestController
@RequestMapping("/book")
public class BookController {
    private ArrayList<Book> books=new ArrayList<Book>();


    @GetMapping("/")
    ArrayList<Book> getAllBooks(){
        return books;
    }

    @PostMapping("/addBook")
    String addBook(@RequestBody Book stu){
        books.add(stu);
        return stu.toString();
    }

    @GetMapping("/isbn")
    String getBookByIsbn(@RequestParam String isbn){
        int i=0,len=books.size();
        for(;i<len;i++)
            if(books.get(i).getIsbn().equals(isbn))break;
        if(i==len)
            return "<h1>Book with Isbn no.: "+isbn+" not found</h1>";
        return books.get(i).toString();

    }

    @GetMapping("/deleteId/{id}")
    String deleteBook(@PathVariable int id){
        int i=0,len=books.size();
        for(;i<len;i++)
            if(books.get(i).getId()==id)break;
        if(i==len)
            return "<h1>Book with Id:"+id+" not found</h1>";
        return books.remove(i).toString();
    }

    
}
