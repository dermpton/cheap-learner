package com.dermpton.elearning.model;

import java.io.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
    private Student student;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherId")
    private Teacher instructor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "assignmentId")
    private Assignment assignment;
	
	@Transient
    private File filePath;
	
	@Column(nullable = false)
    private Float grade;
	
	@Transient
    private String feedback;
	
	@Transient
    private File originalFilename;
    
}
