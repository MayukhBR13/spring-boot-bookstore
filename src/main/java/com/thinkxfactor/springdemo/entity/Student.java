package com.thinkxfactor.springdemo.entity;

public class Student {
    private static int id_generator;
    private int id;
    private String name;
    private int roll;
    private String dept;

    static{
        id_generator=0;
    }
    Student(){this.id=++id_generator;}
    Student(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
        this.id=++id_generator;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getRoll(){
        return this.roll;
    }
    public String getDept(){
        return this.dept;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setDept(String dept){
        this.dept=dept;
    }

    //@Override
    public String toString(){
        return "Student<br>Name: "+name+" ,Id: "+id+" ,Roll: "+roll+" ,Dept: "+dept;
    }
}
