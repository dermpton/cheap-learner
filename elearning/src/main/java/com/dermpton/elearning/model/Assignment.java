package com.dermpton.elearning.model;

import java.io.File;
import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
		name = "assignments"
		)
public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assignmentId;
	
	@Column(nullable = false)
    @NotBlank(message = "A title is required")
	private String title;
	
//	@ManyToOne
//	@Column(nullable = false)
	@SuppressWarnings("unused")
    private Course courseName;
	
//	@OneToMany
//	@Column(nullable = false)
	@SuppressWarnings("unused")
    private Teacher instructor;
	
	@NotBlank(message = "A description is required")
	@Column(nullable = false)
    private String description;
	
	
    @SuppressWarnings("unused")
	private File attachment;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIssued;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Course courseCode;
    
    @NotNull(message = "Candidate Total is required")
    @Column(nullable = false)
    private String gradeTotal;
    
}
