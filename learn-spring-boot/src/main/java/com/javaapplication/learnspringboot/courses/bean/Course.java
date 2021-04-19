package com.javaapplication.learnspringboot.courses.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
@Id
@GeneratedValue
private int id;

//@Column(name="Course_name")
private String name;
private String author;

public Course(){

}

    public Course(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return "Course [id= "+id+" Name of the book"+name+" Author="+author+"]";
    }



}
