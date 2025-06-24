package com.dermpton.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dermpton.elearning.model.Course;
import com.dermpton.elearning.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {

	private final CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public Course saveCourse(Course course) {
//		Related Validation
		return courseRepository.save(course);
	}
	
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	public Optional<Course> findCourseById(Long id){
		
		return courseRepository.findById(id);
	}
	
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
}
