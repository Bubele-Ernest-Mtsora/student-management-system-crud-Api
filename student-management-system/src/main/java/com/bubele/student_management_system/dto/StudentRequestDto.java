package com.bubele.student_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private String studentName;
    private String studentAddress;
    private int studentMarks;
}
