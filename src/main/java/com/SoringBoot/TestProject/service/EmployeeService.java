package com.SoringBoot.TestProject.service;

import com.SoringBoot.TestProject.entity.Employee;
import com.SoringBoot.TestProject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
@Autowired
public EmployeeRepo employeeRepo;

public Employee save(Employee employee){
return employeeRepo.save(employee);
}

public List<Employee> getAll(){
    return employeeRepo.findAll();
}

public Employee getById(Long id){
    return employeeRepo.findById(id).get();
}

public Employee update(Long id, Employee employee){
employee.setId(id);
return employeeRepo.save(employee);
}

public void delete (Long id){
employeeRepo.deleteById(id);
}


}
