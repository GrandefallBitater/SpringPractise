package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class topManager extends employee {
    public topManager(company company1) {
        mounthSalary = 40000;
        personal_income = 0;
        companyName = company1;
        if (companyName.getIncome() > 10000000) {
            mounthSalary = mounthSalary * 5 / 2;
        }
    }

    public topManager() {
        mounthSalary = 40000;
        personal_income = 0;
    }

    @Override
    public void prepare(company company){
        companyName = company;
        if (companyName.getIncome() > 10000000) {
            mounthSalary = mounthSalary * 5 / 2;
        }
    }
}
