package com.example.demo.repositories;

import com.example.demo.models.company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companyRepositore extends JpaRepository<company, String> {
}
