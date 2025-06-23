package com.dermpton.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dermpton.elearning.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
