package com.dermpton.elearning.model;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
	
	@NotBlank(message = "Provide a system role")
	@Column(nullable = false)
    private String systemRole;

    @ElementCollection
    private List<String> announcements;
    
    @ElementCollection
    private List<String> feedback;
    
    @NotBlank(message = "Provide an Institution/Organization")
    @Column(nullable = false)
    private String adminSchool;

    @NotBlank(message = "Provide a name")
    @Column(nullable = false)
    private String teachersName;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "instructor")
    List<Course> courses;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date initialDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogout;

    @NotNull(message = "Password required")
    @Column(nullable = false)
    @Size(
    		min = 8,
    		max = 64,
    		message = "Password must be between 8 and 64 characters"
    		)
    @Pattern(
    		regexp = "^(?=.*[0-9])(?=.*[A-Z](?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,65})$"
    		)
    private String password;  
    
    @OneToMany(mappedBy = "instructor")
    private List<Assignment> assignment;
    
}


