package com.thinkxfactor.springdemo.entity;

public class Admin {
    private static int id_generator;
    private int id;
    private String name;

    static{
        id_generator=0;
    }
    Admin(){this.id=++id_generator;}
    Admin(String name){
        this.name=name;
        this.id=++id_generator;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    //@Override
    public String toString(){
        return "Admin<br>Name: "+name+" ,Id: "+id;
    }
}
