package com.dermpton.elearning.model;

import java.util.*;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
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
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
	
	@Transient
    private Integer activeLearnerTotal;
    
    @NotBlank(message = "Provide a course name")
    private String courseName;
    
    @NotNull
    private String description;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @ElementCollection
    private List<String> addCourse;
    
    @ManyToOne
    @JoinColumn(name = "teacherId", nullable = false)
    private Teacher instructor;
    
    @ManyToMany
    @JoinTable(
    		name = "enrollment",
    		joinColumns = @JoinColumn(name = "courseId"),
    		inverseJoinColumns = @JoinColumn(name = "studentId")
    		)
    private List<Student> students;
    
//    @OneToMany(mappedBy = "courseName")
//    private Assignment assignment;
}
