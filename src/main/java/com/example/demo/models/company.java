package com.example.demo.models;

import com.example.demo.services.employeeService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "company")
public class company {
    @Id
    @Column(name = "name")
    String name;
    @Column(name = "income")
    int income;

    public company(){

    }

    public company(String name){
        this.name = name;
        this.income = 1000000;
    }

    public void hire(employee employee){
            employee.prepare(this);
    }

    public void hireAll(List<employee> employeeList){
        for (employee e:
             employeeList) {
            e.prepare(this);
        }
    }
}