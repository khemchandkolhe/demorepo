package com.ashokit.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.response.Student;
import com.ashokit.response.Students;

@RestController
@RequestMapping("/stud")
public class StudentRestController {
	@GetMapping(value = "/stud/{sid}", produces = { "application/json", "application/xml" }

	)
	public Student getStudentDetails(@PathVariable("sid") Integer studentId) {
		Student s = new Student();
		if (studentId == 101) {
			s.setStudentId(101);
			s.setStudentName("raja");
			s.setStudentSkill("java");
		} else if (studentId == 102) {

			s.setStudentId(102);
			s.setStudentName("rani");
			s.setStudentSkill("java programming");
		}
		return s;

	}

	/*
	 * @GetMapping(value = "/students") public List<Student> getStudentsDetails() {
	 * 
	 * List<Student> sList=new ArrayList<>();
	 * 
	 * Student s1=new Student();
	 * 
	 * s1.setStudentId(101); s1.setStudentName("raja"); s1.setStudentSkills("java");
	 * 
	 * Student s2=new Student();
	 * 
	 * s2.setStudentId(102); s2.setStudentName("rani");
	 * s2.setStudentSkills("java programming");
	 * 
	 * sList.add(s1); sList.add(s2);
	 * 
	 * 
	 * return sList;
	 * 
	 * }
	 */

	@GetMapping(value = "/students", produces = { "application/json", "application/xml" })
	public Students getStudentsDetails() {

		List<Student> sList = new ArrayList<>();

		Student s1 = new Student();

		s1.setStudentId(101);
		s1.setStudentName("raja");
		s1.setStudentSkill("java");

		Student s2 = new Student();

		s2.setStudentId(102);
		s2.setStudentName("rani");
		s2.setStudentSkill("java programming");

		sList.add(s1);
		sList.add(s2);

		Students students = new Students();
		students.setStudents(sList);

		return students;

	}

}
