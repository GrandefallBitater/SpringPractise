package com.example.demo.repositories;

import com.example.demo.models.company;
import com.example.demo.models.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeeRepositore extends JpaRepository<employee, Integer> {
    List<employee> findAllByCompanyName(company company);

    @Query("SELECT t from employee t where t.companyName=:company order by t.mounthSalary ASC")
    List<employee> findAllByCompanyNameOrderByMounthSalaryAsc(company company);

    @Query("SELECT t from employee t where t.companyName=:company order by t.mounthSalary desc")
    List<employee> findAllByCompanyNameOrderByMounthSalaryDesc(company company);
}
