package com.springboot.app;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

	@GetMapping("/students")
	public List<Student> getStudents(){		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Anta", "Diop", 25 , "Tivaone"));
		students.add(new Student("Mamadou ", "GUéye", 30, "Tambacounda"));
		students.add(new Student("Fatou", "Ndao", 14, "Touba"));
		students.add(new Student("El Hadji Mor", "Diop", 32, "Thiès"));
		students.add(new Student("Umesh", "Fadatare", 45, "Mbour"));
		return students;
	}
	
	// http://localhost:9090/student/1
		// @PathVariable annotation
		@GetMapping("/student/{firstName}/{lastName}/{age}/{adresse}")
		public Student studentPathVariable(@PathVariable("firstName") String firstName, 
				@PathVariable("lastName") String lastName,
		        @PathVariable("age") int age, 
                @PathVariable("adresse") String adresse){
			return new Student(firstName, lastName, age, adresse);
		}

		// build rest API to handle query parameters
		// http://localhost:9090/student/query?firstName=Ramesh&lastName=Fadatare
		@GetMapping("/student/query")
		public Student studentQueryParam(
				@RequestParam(name = "firstName") String firstName, 
				@RequestParam(name = "lastName") String lastName,
				@RequestParam(name ="age") int age, 
				@RequestParam(name = "adresse") String adresse){
			return new Student(firstName, lastName, age, adresse);
		}
}
