package com.dermpton.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dermpton.elearning.model.Student;
import com.dermpton.elearning.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

//	We enlist final for a singleton access to the Database
//	It must be initialized once and only once
//	It cannot be reassigned
//	helps immutability and thread safety
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Student saveStudent(Student student) {
//		Validation logic will be added later on...
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
}
