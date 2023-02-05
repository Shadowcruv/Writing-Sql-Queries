package com.example.mySpringRepoProject.Repository;

import com.example.mySpringRepoProject.Entity.Course;
import com.example.mySpringRepoProject.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void getCourseMaterials(){
        List<Course> courseList = new ArrayList<>();
        try {
         courseList = courseRepository.findAll();
       }catch (Exception e){
           System.out.println("No courses available");
       }
        System.out.println("courseList = " + courseList);

    }

    @Test
    public void saveCourse(){
        courseRepository.save(new Course("GRA", 4));
    }
}