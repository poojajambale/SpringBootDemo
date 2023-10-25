package com.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Pooja", "Pune");
	}
	
	@GetMapping("/students")
	public List<Student> getStudentList(){
		List<Student> s = new ArrayList<>();
		
		s.add(new Student("Satyam", "Bhopal"));
		s.add(new Student("Shikha", "Delhi"));
		
		return s;
	}
}
