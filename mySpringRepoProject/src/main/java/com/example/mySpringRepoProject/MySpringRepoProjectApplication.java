package com.example.mySpringRepoProject;

import com.example.mySpringRepoProject.Entity.Course;
import com.example.mySpringRepoProject.Entity.CourseMaterial;
import com.example.mySpringRepoProject.Entity.Guardian;
import com.example.mySpringRepoProject.Entity.Student;
import com.example.mySpringRepoProject.Repository.CourseMaterialRepository;
import com.example.mySpringRepoProject.Repository.CourseRepository;
import com.example.mySpringRepoProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MySpringRepoProjectApplication {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(MySpringRepoProjectApplication.class, args);
	}

	@Bean
	public void saveStudent(){
		Student student1 = new Student("Anna","gold@gmail.com","9349545433", "Nigeria",
				new Guardian("Cynthia","cynthia@gmail.com",
						"8358579383"));

		Student student2 = new Student("Chiamaka","oseka@gmail.com","3446467574", "Nigeria",
				new Guardian("Jude","jude@gmail.com",
						"937473443"));

		Student student3 = new Student("Asegbu","odumegu@gmail.com","232435632", "Nigeria",
				new Guardian("Chuka","chuka@gmail.com",
						"8575757483"));

		Student student4 = new Student("Asegbu","chikao@gmail.com","15363667", "Nigeria",
				new Guardian("Nkechi","nkechi@gmail.com",
						"14553557478"));

		List<Student> pack = new ArrayList<Student>();
		pack.add(student1);
		pack.add(student2);
		pack.add(student3);
		pack.add(student4);

		System.out.println("pack = " + pack);

		studentRepository.saveAll(pack);

	}
	@Bean
	public void saveCourseMaterials(){
		courseMaterialRepository.save(new CourseMaterial("www.google.com",
				new Course("DSB",3)));

		courseMaterialRepository.save(new CourseMaterial("www.yahoo.com",
				new Course("DSA",6)));
	}
	@Bean
	public void getCourseMaterials(){
		courseRepository.save(new Course("ECS",2));



	}
}
