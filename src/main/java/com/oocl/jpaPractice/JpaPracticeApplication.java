package com.oocl.jpaPractice;

import com.oocl.jpaPractice.oneToMany.entity.Company;
import com.oocl.jpaPractice.oneToMany.entity.Employee;
import com.oocl.jpaPractice.oneToMany.repository.CompanyRepository;
import com.oocl.jpaPractice.oneToMany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaPracticeApplication {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaPracticeApplication.class, args);
	}

	@PostConstruct
    private void initEmployeeRepository(){
        Employee employee1 = new Employee(1L,  "张三", new Company(1L));
        Employee employee2 = new Employee(2L, "李四", new Company(1L));
        Employee employee3 = new Employee(3L, "赵武", new Company(1L));
        Employee employee4 = new Employee(4L, "王八", new Company(2L));
        Employee employee5 = new Employee(5L, "陈六", new Company(2L));
        this.employeeRepository.saveAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
    }

    @PostConstruct
    private void initCompanyRepository(){
        Company company1 = new Company(1L, "公司一");
        Company company2 = new Company(2L, "公司二");
        this.companyRepository.saveAll(Arrays.asList(company1, company2));
    }



}
