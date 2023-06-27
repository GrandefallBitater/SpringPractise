package com.example.demo.services;

import com.example.demo.models.company;
import com.example.demo.models.employee;
import com.example.demo.repositories.employeeRepositore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class employeeService {

    @Autowired
    private employeeRepositore employeeRepositore;

    public void createEmployee(employee employee){
        employeeRepositore.save(employee);
    }

    public void removeEmployee(company company){
        List<employee> employeeList = employeeRepositore.findAllByCompanyName(company);
        Iterator<employee> iterator = employeeList.iterator();
        employeeRepositore.delete(iterator.next());
    }

    public List<employee> topList(int count, company company){
        if(count <= 0){
            return null;
        }else{
            List<employee> employeeList = employeeRepositore.findAllByCompanyNameOrderByMounthSalaryDesc(company);
            if(count > employeeList.size()){
                return employeeList;
            }else{
                return employeeList.subList(0, count);
            }
        }
    }

    public List<employee> lowestList(int count, company company){
        if(count <= 0){
            return null;
        }else{
            List<employee> employeeList = employeeRepositore.findAllByCompanyNameOrderByMounthSalaryAsc(company);
            if(count > employeeList.size()){
                return employeeList;
            }else{
                return employeeList.subList(0, count);
            }
        }
    }
}
