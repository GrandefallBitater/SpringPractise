package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employee")
public abstract class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @ManyToOne
    @JoinColumn(name = "company_name")
    company companyName;
    @Column(name = "mounthsalary")
    int mounthSalary;
    @Column(name = "personal_income")
    int personal_income;

    public void prepare(company company) {

    }
}
