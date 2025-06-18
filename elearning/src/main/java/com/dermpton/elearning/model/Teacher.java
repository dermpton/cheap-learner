package com.dermpton.elearning.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
    name = "teacher"
)
public class Teacher {
    private String[] announcements;

    @NonNull
    private String teachersName;
    

}
