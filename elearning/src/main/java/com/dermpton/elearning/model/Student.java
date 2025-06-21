package com.dermpton.elearning.model;


import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
	
	@ElementCollection
    private List<String> announcements;
	
	@ElementCollection
    private List<String> feedback;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @ManyToMany
    @ElementCollection
    private List<Course> enrolledCourses;

    @ManyToOne
    private Teacher adminSchool; 
    
    @NotBlank(message = "Password must not be blank")
    @Size(
    		min = 8,
    		max = 64,
    		message = "Password must be between 8 and 64 characters"
    		)
    @Pattern(
    		regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,65}$"
    		)
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "Enter student name")
    @Column(nullable = false)
    private String studentName;
    
}

/*
 * RegEx
 * ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}$
 * 
 * ^						# start-of-string
 * (?=.*[0-9])				# a digit must occur at least once
 * (?=.*[a-z])				# a lower case letter must occur at least once
 * (?=.*[A-Z])				# an upper case letter must occur at least once
 * (?=.*[@#$%^&+=])			# a special character must occur at least once
 * (?=\\S+$)				# no whitespace allowed in the entire string
 * .{8,65}					# anything between 8 and 64 places
 * $						# end-of-string 
 * */
