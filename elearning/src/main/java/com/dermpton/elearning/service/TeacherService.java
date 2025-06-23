package com.dermpton.elearning.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dermpton.elearning.model.Teacher;
import com.dermpton.elearning.repository.TeacherRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherService {


	private final TeacherRepository teacherRepository;
	
	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}
	
	public Teacher saveTeacher(Teacher teacher) {
//		Relevant Validation ...
		return teacherRepository.save(teacher);
	}
	
	public List<Teacher> getAllTeachers(){
		return teacherRepository.findAll();
	}
	
	public Optional<Teacher> getTeacherById(Long id){
		return teacherRepository.findById(id);
	}
	
	public void deleteTeacher(Long id) {
		teacherRepository.deleteById(id);
	}
	
}

