package com.dermpton.elearning.model;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
    name = "student"
)
public class Student {
    private int studentCount;
    private String[] announcements;
    private String feedback[];
    
    @ManyToOne
    private String[] enrolledCourses;

    @ManyToOne
    private String adminSchool; 
    
    @NonNull
    private String password;

    @NonNull() 
    private String studentName;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private String email;

}
