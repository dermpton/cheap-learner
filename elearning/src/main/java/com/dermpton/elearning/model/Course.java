package com.dermpton.elearning.model;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(
    name = "courses"
)
public class Course {
    private Integer activeLearnerTotal;
    private String courseName;
    private String description;
    private Date createdAt;
    private List<String> addCourse;
    private Long courseId;
    private Teacher instructorId;
    private List<Student> students;
}
