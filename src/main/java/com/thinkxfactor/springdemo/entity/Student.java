package com.thinkxfactor.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "roll")
    private int roll;

    @Column(name = "dept")
    private String dept;

    
    Student(){}
    Student(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
    }
    public long getId(){
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
