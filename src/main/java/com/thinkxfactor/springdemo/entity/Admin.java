package com.thinkxfactor.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="tlb_books")
public class Admin {
    
    @Id
    @Column(name = "id")
    @GeneratorValue
    private int id;
    private String name;

    Admin(){}
    Admin(String name){
        this.name=name;
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
