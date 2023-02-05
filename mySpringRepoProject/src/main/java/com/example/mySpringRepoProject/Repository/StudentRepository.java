package com.example.mySpringRepoProject.Repository;

import com.example.mySpringRepoProject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findStudentById(Long id);

    @Query("select s from Student s where s.id = :id")
    public Student getStudentById(@Param("id") long id);

    @Query("select s.country from Student s where s.emailId = :emailyy")
    public String getFirstNameByEmail(@Param("emailyy") String emailyy);

    @Query("select s.emailId from Student s where lower(s.name) like lower(concat(:firstnamey))")
    public List<String> getEmailByFirstName(@Param("firstnamey") String firstnamey);

    @Query(
            value = "select * from tb_student s where s.id = :id",
            nativeQuery = true
    )
    public Student getStudentByIdNative(@Param("id") long id);

    @Query(
            value = "select s.country from tb_student s where s.emailId = :emailyy",
            nativeQuery = true
    )
    public String getFirstNameByEmailNative(@Param("emailyy") String emailyy);


    @Query(
            value = "select email_address from tb_student where lower(name) like lower(concat(:firstnamey))",
            nativeQuery = true
    )
    public List<String> getEmailByFirstNameNative(@Param("firstnamey") String firstnamey);

    @Modifying
    @Transactional
    @Query(
            value = "update tb_student s set s.name = :firstName where s.email_address = :email",
            nativeQuery = true
    )
    public void updateStudentQuery(String email, String firstName);

    //  @Query("select s.emailId from tb_student s where lower(s.name) like lower(concat(:firstnamey))")
}
