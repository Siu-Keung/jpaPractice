package com.oocl.jpaPractice.oneToMany.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.ZonedDateTime;

/**
 * @author Dylan Wei
 * @date 2018-07-26 13:49
 */

@Table(name = "employee")
@Entity
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    private ZonedDateTime createDate = ZonedDateTime.now();

    public Employee() {
    }

    public Employee(Long id, String name){
        this.id = id;
        this.name = name;
    }

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
}
