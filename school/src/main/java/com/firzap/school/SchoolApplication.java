package com.firzap.school;

import com.firzap.school.entity.Course;
import com.firzap.school.entity.Student;
import com.firzap.school.repository.CourseRepository;
import com.firzap.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

//	@Autowired
//	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Firzap", "Irza", "firzap@mail.com");
//		studentRepository.save(student1);
//		Course course = new Course("Penjaskes", "Pendidikan jasmani dan kesehatan");
//		courseRepository.save(course);
	}
}
