package com.dermpton.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dermpton.elearning.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
