package com.oocl.employeeapi.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Company {
    private String companyName;
    private int employeesNumber;
    private List<Employee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployeesNumber(){
        this.employeesNumber++;
    }
    public void subEmployeesNumber(){
        this.employeesNumber--;
    }
}
