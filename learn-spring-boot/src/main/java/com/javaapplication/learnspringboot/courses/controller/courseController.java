package com.javaapplication.learnspringboot.courses.controller;

import com.javaapplication.learnspringboot.courses.bean.Course;
import com.javaapplication.learnspringboot.courses.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class courseController {

    @Autowired
    private CourseRepository repository;


    //http://localhost:8080/courses
    @GetMapping("/courses")

    public List<Course> getAllCourses(){
        return repository.findAll();

//        return Arrays.asList(new Course(1,"JAVA","Sumita arora"),
//                new Course(2,"Fullstack","Yash Raj"));
    }
    //http://localhost:8080/courses/1

    //to retrieve data from a specific id
    @GetMapping("/courses/{id}")

    public Course getAllCourses1(@PathVariable int id ){
        Optional<Course> course = repository.findById(id);
        if (course.isEmpty()){
            throw new RuntimeException("Course not found");
        }
        return course.get();
//        return new Course(3,"Let us C","Yashwant ");
    }

    //To add a new course to the database(to receive a json)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable int id,@RequestBody Course course){
        repository.save(course);
    }
    @DeleteMapping ("/courses/{id}")
    public void deleteCourse(@PathVariable int id){
        repository.deleteById(id);
    }


}
