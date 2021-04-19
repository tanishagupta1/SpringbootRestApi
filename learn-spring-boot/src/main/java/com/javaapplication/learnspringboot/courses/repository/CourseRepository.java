package com.javaapplication.learnspringboot.courses.repository;

import com.javaapplication.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}
