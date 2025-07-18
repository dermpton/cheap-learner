package com.dermpton.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dermpton.elearning.model.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {

}
