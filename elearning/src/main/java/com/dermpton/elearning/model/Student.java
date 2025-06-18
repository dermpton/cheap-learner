package com.dermpton.elearning.model;

import org.springframework.lang.NonNull;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
    name = "students"
)
public class Student {
    private List<String> announcements;
    private List<String> feedback;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @ManyToMany
    private List<Course> enrolledCourses;

    @ManyToOne
    private Teacher adminSchool; 
    
    @NotNull
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "Enter student name")
    private String studentName;
    
}
