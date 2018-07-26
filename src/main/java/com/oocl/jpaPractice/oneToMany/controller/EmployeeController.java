package com.oocl.jpaPractice.oneToMany.controller;

import com.oocl.jpaPractice.oneToMany.entity.Company;
import com.oocl.jpaPractice.oneToMany.entity.Employee;
import com.oocl.jpaPractice.oneToMany.repository.CompanyRepository;
import com.oocl.jpaPractice.oneToMany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

/**
 * @author Dylan Wei
 * @date 2018-07-26 13:48
 */
@RestController
@RequestMapping("/oneToMany/employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        List<Employee> a =  this.employeeRepository.findAll();
        return a;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeRepository.save(employee);
    }




}
