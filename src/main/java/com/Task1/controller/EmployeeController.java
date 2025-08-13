package com.Task1.controller;

import com.Task1.model.Employee;
import com.Task1.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public ResponseEntity<String> saveFileData(@RequestParam("file") MultipartFile file) throws IOException {
        employeeService.savefiledata(file.getInputStream());
        return ResponseEntity.ok("Excel File Data Saved into Database");
    }

    @GetMapping("/read-data")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findall());
    }
}