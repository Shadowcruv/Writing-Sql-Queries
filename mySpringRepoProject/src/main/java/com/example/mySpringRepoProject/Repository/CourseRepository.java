package com.example.mySpringRepoProject.Repository;

import com.example.mySpringRepoProject.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
