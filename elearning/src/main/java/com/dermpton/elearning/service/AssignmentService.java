package com.dermpton.elearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dermpton.elearning.model.Assignment;
import com.dermpton.elearning.repository.AssignmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AssignmentService {

	private final AssignmentRepository assignmentRepository;
	
	public AssignmentService(AssignmentRepository assignmentRepository) {
		this.assignmentRepository = assignmentRepository;
	}
	
	public Assignment saveAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}
	
	public List<Assignment> getAllAssignments(){
		return assignmentRepository.findAll();
	}
	
	public Optional<Assignment> getAssignmentById(Long id){
		return assignmentRepository.findById(id);
	}
	
	public void deleteAssignment(Long id) {
		assignmentRepository.deleteById(id);
	}
}

