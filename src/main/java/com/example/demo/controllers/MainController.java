package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.services.companyService;
import com.example.demo.services.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private companyService companyService;

    @Autowired
    private employeeService employeeService;

    @RequestMapping("/addCompany/{name}")
    public void addCompany(@PathVariable("name") String name){
        company company = new company(name);
        companyService.createCompany(company);
    }
    @RequestMapping("/addOperator/{name}")
    public void addOperator(@PathVariable("name") String name){
        company company = new company(name);
        operator operator = new operator();
        company.hire(operator);
        employeeService.createEmployee(operator);
        System.out.println("1");
    }

    @RequestMapping("/addManager/{name}")
    public void AddManager(@PathVariable("name") String name){
        company company = new company(name);
        manager manager = new manager();
        company.hire(manager);
        employeeService.createEmployee(manager);
        System.out.println("2");
    }

    @RequestMapping("/addTopManager/{name}")
    public void AddTopManager(@PathVariable("name") String name){
        company company = new company(name);
        topManager topmanager = new topManager();
        company.hire(topmanager);
        employeeService.createEmployee(topmanager);
        System.out.println("3");
    }

    @RequestMapping("/remove/{name}")
    public void remove(@PathVariable("name") String name){
        company company = new company(name);
        employeeService.removeEmployee(company);
        System.out.println("4");
    }

    @RequestMapping("/top/{name}/{count}")
    public void top(@PathVariable("count") String count, @PathVariable("name") String name){
        company company = new company(name);
        List<employee> employeeList;
        employeeList = employeeService.topList(Integer.parseInt(count), company);
        for (employee e:
             employeeList) {
            System.out.println(e.getMounthSalary() + " rub\n");
        }
        System.out.println("5");
    }

    @RequestMapping("/lowest/{name}/{count}")
    public void lowest(@PathVariable("count") String count, @PathVariable("name") String name){
        company company = new company(name);
        List<employee> employeeList;
        employeeList = employeeService.lowestList(Integer.parseInt(count), company);
        for (employee e:
                employeeList) {
            System.out.println(e.getMounthSalary() + " rub\n");
        }
        System.out.println("6");
    }
}
