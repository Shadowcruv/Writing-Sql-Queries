package com.example.mySpringRepoProject.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data

public class Course {

    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "course_sequence"
    )
    private Long courseId;
    private String title;
    private int credits;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    public Course() {
    }


    public Course(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }


}
