package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class manager extends employee {
    public manager(company company1) {
        personal_income = 115000 + (int) (Math.random() * 140000);
        mounthSalary = 40000 + personal_income * 5 / 100;
        companyName = company1;
    }

    public manager() {
        personal_income = 115000 + (int) (Math.random() * 140000);
        mounthSalary = 40000 + personal_income * 5 / 100;
    }

    @Override
    public void prepare(company company){
        companyName = company;
    }
}
