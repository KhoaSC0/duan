package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot API";
	}

	@GetMapping("/student/{id}")
	public String getStudent(@PathVariable int id) {
		return "Sinh viên có mã: " + id;
	}

	@GetMapping("/student")
	public String greetStudent(@RequestParam String name) {
		return "Xin chào " + name;
	}

	@GetMapping("/searchstudent")
	public String searchStudent(@RequestParam String name, @RequestParam(defaultValue = "1") int age) {
		return "Tên: " + name + ", tuổi: " + age;
	}
}
