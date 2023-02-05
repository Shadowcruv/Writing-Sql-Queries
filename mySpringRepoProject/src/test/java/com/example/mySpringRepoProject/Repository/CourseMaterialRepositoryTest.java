package com.example.mySpringRepoProject.Repository;

import com.example.mySpringRepoProject.Entity.Course;
import com.example.mySpringRepoProject.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterials(){
        courseMaterialRepository.save(new CourseMaterial("www.amazon.com",
                new Course("FSA",3)));

    }
    @Test
    public void getCourseMaterials(){
       List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
        System.out.println("courseMaterialList = " + courseMaterialList);

    }



}