package com.Task1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.math3.analysis.function.Identity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Nitish")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.Identity)
    private int empid;
    private String empName;

}
