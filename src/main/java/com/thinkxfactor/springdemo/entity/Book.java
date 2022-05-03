package com.thinkxfactor.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tlb_books")
public class Book {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "authorName")
    private String authorName;

    Book(){}
    Book(String name,String isbn,String auName){
        this.name=name;
        this.isbn=isbn;
        this.authorName=auName;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }

    //@Override
    public String toString(){
        return "Book<br>Name: "+name+" ,Id: "+id+" ,ISBN: "+isbn+" ,Author Name: "+authorName;
    }
}
