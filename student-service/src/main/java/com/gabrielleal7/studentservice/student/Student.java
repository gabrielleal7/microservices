package com.gabrielleal7.studentservice.student;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private String id;

    private String name;
    private int age;
    private String gender;
    private Integer schoolId;
}
