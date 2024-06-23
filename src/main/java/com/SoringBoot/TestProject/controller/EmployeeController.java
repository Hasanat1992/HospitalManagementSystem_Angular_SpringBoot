package com.SoringBoot.TestProject.controller;

import com.SoringBoot.TestProject.entity.Employee;
import com.SoringBoot.TestProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/employee")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(employeeService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Success !");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.update(id, employee));
    }
}
