package com.oocl.jpaPractice.oneToMany.dto;

import com.oocl.jpaPractice.oneToMany.entity.Company;

import java.time.ZonedDateTime;

/**
 * @author Dylan Wei
 * @date 2018-07-26 20:52
 */
public class EmployeeDTO {
    private Long id;
    private String name;
    private ZonedDateTime createDate = ZonedDateTime.now();
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
