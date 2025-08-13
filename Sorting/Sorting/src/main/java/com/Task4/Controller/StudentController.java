package com.Task4.Controller;

import com.Task4.model.Student;
import com.Task4.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/filterB")
    public List<Student> getFilteredStudents() {
        return studentService.getStudentsStartingWithBAndSortedByMarksDesc();
    }
}
