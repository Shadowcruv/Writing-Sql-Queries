package com.example.mySpringRepoProject.Repository;

import com.example.mySpringRepoProject.Entity.Guardian;
import com.example.mySpringRepoProject.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Ideally, you should not be testing your repository layer with @SpringBootTest but because the @DataJpa
//annotation will flush out the data from the dataBase after it finishes testing, that's why we are using
// the standard testing (@SpringBootTest)
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    /*
     private Long id;
    private String name;

    @Column( name = "email_address")
    private String emailId;
    @Column( name = "mobile_number")
    private String mobile;

    private String country;
    @Embedded
    private Guardian guardian;
     */

  /*  @Test
    public void saveStudent(){
        Student student = new Student("Anna","Gold","9349545433", "Nigeria",
                                            new Guardian("Cynthia","cynthia@gmail.com",
                                                        "8358579383"));

        studentRepository.save(student);
     //   System.out.println(student);

    }

   */


/*
    @Test
    public void getStudent(){
        Student student  = studentRepository.findStudentById(2L);
        System.out.println("student = " + student);
    }

    @Test
    public void getStudentDefinedJplQuery(){
        Student student = studentRepository.getStudentById(3L);
        System.out.println("student = " + student);
    }

    @Test
    public void getFirstNameByEmailDefinedJplQuery(){
        String firstNameGotten  =  studentRepository.getFirstNameByEmail("oseka@gmail.com");
        System.out.println("firstNameGotten = " + firstNameGotten);
    }

    @Test
    public void getEmailByFirstNameDefinedJplQuery(){
       List<String> firstNameGotten  =  studentRepository.getEmailByFirstName("Asegbu");
        System.out.println("firstNameGotten = " + firstNameGotten);
    }

    @Test
    public void getStudentDefinedNativeQuery(){
        Student student = studentRepository.getStudentById(3L);
        System.out.println("student = " + student);
    }

    @Test
    public void getFirstNameByEmailDefinedNativeQuery(){
        String firstNameGotten  =  studentRepository.getFirstNameByEmail("oseka@gmail.com");
        System.out.println("firstNameGotten = " + firstNameGotten);
    }

    @Test
    public void getEmailByFirstNameDefinedNativeQuery(){
        List<String> firstNameGotten  =  studentRepository.getEmailByFirstNameNative("Asegbu");
        System.out.println("firstNameGotten = " + firstNameGotten);
    }


 */
    @Test
    public void updatePupil(){
        studentRepository.updateStudentQuery("oseka@gmail.com","Asegbu");
    }

    @Test
    public void getAllStudent(){
        List<Student> student  = studentRepository.findAll();
        System.out.println("student = " + student);
    }


}