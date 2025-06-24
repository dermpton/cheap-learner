package com.dermpton.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dermpton.elearning.model.Submission;
import com.dermpton.elearning.repository.SubmissionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubmissionService {

	private final SubmissionRepository submissionRepository;
	
	public SubmissionService(SubmissionRepository submissionRepository) {
		this.submissionRepository = submissionRepository;
	}
	
	public Submission saveSubmission(Submission submission) {
		return submissionRepository.save(submission);
	}
	
	public Optional<Submission> findSubmissionById(Long id){
		return submissionRepository.findById(id);
	}
	
	public List<Submission> findAllSubmissions(){
		return submissionRepository.findAll();
	}
	
	public void deleteSubmission(Long id) {
		submissionRepository.deleteById(id);
	}
}
