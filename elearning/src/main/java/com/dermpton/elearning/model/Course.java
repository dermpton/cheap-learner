package com.dermpton.elearning.model;

import java.util.*;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(
    name = "courses"
)
public class Course {
	
	@SuppressWarnings(value = "unused")
    private Integer activeLearnerTotal;
    
    @NotBlank(message = "Provide a course name")
    private String courseName;
    
    @NotNull
    private String description;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @ElementCollection
    private List<String> addCourse;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    
//    @OneToMany
    @SuppressWarnings("unused")
    private Teacher instructorId;
    
//    @ManyToMany
    @ElementCollection
    private List<Student> students;
}
