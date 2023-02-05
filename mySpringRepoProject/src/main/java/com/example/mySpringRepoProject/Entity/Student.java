package com.example.mySpringRepoProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table( name = "tb_student")
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "student_sequence"
    )
    private Long id;
    private String name;

    @Column( name = "email_address")
    private String emailId;
    @Column( name = "mobile_number")
    private String mobile;

    private String country;
    @Embedded
    private Guardian guardian;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, String emailId, String mobile, String country, Guardian guardian) {
        this.name = name;
        this.emailId = emailId;
        this.mobile = mobile;
        this.country = country;
        this.guardian = guardian;
    }
}
