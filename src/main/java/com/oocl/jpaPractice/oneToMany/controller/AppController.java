package com.oocl.jpaPractice.oneToMany.controller;

import com.oocl.jpaPractice.oneToMany.entity.Employee;
import com.oocl.jpaPractice.oneToMany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.math.BigInteger;

/**
 * @author Dylan Wei
 * @date 2018-07-26 13:48
 */
@RestController
public class AppController {

    private EmployeeRepository employeeRepository;
@Autowired
    public AppController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }




}
