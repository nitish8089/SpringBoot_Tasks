package com.Task4.Service;

import com.Task4.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StudentService {

    // Mock list (replace with DB later)
    private List<Student> students = Arrays.asList(
            new Student(1, "Bharat", 101, 85),
            new Student(2, "Amit", 102, 90),
            new Student(3, "Bhavana", 103, 92),
            new Student(4, "Chirag", 104, 80),
            new Student(5, "Balaji", 105, 88)
    );

    public List<Student> getStudentsStartingWithBAndSortedByMarksDesc() {
        return students.stream()
                .filter(s -> s.getName().startsWith("B"))
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .collect(Collectors.toList());
    }
}

