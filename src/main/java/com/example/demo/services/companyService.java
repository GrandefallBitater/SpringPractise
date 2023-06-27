package com.example.demo.services;

import com.example.demo.models.company;
import com.example.demo.repositories.companyRepositore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class companyService {

    @Autowired
    private companyRepositore companyRepositore;

    public void createCompany(company company){
        companyRepositore.save(company);
    }
}
