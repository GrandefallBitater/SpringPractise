package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class operator extends employee {
    public operator(company company1) {
        mounthSalary = 20000;
        personal_income = 0;
        companyName = company1;
    }

    public operator() {
        mounthSalary = 20000;
        personal_income = 0;
    }

    @Override
    public void prepare(company company){
        companyName = company;
    }
}
