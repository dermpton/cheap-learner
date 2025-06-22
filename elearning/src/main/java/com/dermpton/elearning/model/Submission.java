package com.dermpton.elearning.model;

import java.io.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "submissions")
public class Submission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long submissionId;
	
//	@OneToMany
	@SuppressWarnings("unused")
    private Student studentId;
	
//	@OneToMany
	@SuppressWarnings("unused")
    private Teacher instructorId;
	
//	@OneToOne
	@SuppressWarnings("unused")
    private Assignment assignmentId;
	
	@SuppressWarnings("unused")
    private File filePath;
	
	@Column(nullable = false)
    private Float grade;
	
	@SuppressWarnings("unused")
    private String feedback;
	
	@SuppressWarnings("unused")
    private File originalFilename;
    
}
