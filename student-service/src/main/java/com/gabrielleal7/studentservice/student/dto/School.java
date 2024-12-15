package com.gabrielleal7.studentservice.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private int id;
    private String name;
    private String location;
    private String principal;
}
