package com.bubele.student_management_system.services;

import com.bubele.student_management_system.dto.StudentRequestDto;
import com.bubele.student_management_system.entity.Student;
import com.bubele.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(StudentRequestDto dto){
        Student student = new Student();

        student.setStudentName(dto.getStudentName());
        student.setStudentAddress(dto.getStudentAddress());
        student.setStudentMarks(dto.getStudentMarks());

        return studentRepository.save(student);

    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId){
       return studentRepository.findById(studentId).get();
    }

    public Student updateStudent(StudentRequestDto dto, int studentId){
        Student s = studentRepository.findById(studentId).get();

        s.setStudentName(dto.getStudentName());
        s.setStudentAddress(dto.getStudentAddress());
        s.setStudentMarks(dto.getStudentMarks());

        return studentRepository.save(s);

    }

    public String deleteStudentId(int studentId){
        studentRepository.deleteById(studentId);
        return "Student deleted Successfully";
    }


}

