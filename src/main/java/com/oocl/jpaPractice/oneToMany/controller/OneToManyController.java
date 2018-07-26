package com.oocl.jpaPractice.oneToMany.controller;

import com.oocl.jpaPractice.oneToMany.entity.Employee;
import com.oocl.jpaPractice.oneToMany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

/**
 * @author Dylan Wei
 * @date 2018-07-26 13:48
 */
@RestController
@RequestMapping("/oneToMany")
public class OneToManyController {
    private EmployeeRepository employeeRepository;

    @Autowired
    public OneToManyController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }






}
