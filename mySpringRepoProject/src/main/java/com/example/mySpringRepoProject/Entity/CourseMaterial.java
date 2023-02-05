package com.example.mySpringRepoProject.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    private Long courseMaterialId;
    private String url;

    /*
    cascade is so that the object "course" too can be saved if not transient object would not be saved.

    JoinColumn {

        name : creates an extra column that holds refereces identity to other tables.
        ReferencedColumnName : is used to refer to the object table we are referencing to or connecting to.

      }
     */

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER

    )
    @JoinColumn(
            name = "JoinCourseId",
            referencedColumnName = "courseId"

    )

    private Course course;

    public CourseMaterial() {

    }

    public CourseMaterial( String url, Course course) {
        this.url = url;
        this.course = course;
    }
}
