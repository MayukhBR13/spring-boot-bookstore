package com.thinkxfactor.springdemo.entity;

public class Book {
    private static int id_generator;
    private int id;
    private String name;
    private String isbn;
    private String authorName;

    static{
        id_generator=0;
    }
    Book(){this.id=++id_generator;}
    Book(String name,String isbn,String auName){
        this.name=name;
        this.isbn=isbn;
        this.authorName=auName;
        this.id=++id_generator;
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
