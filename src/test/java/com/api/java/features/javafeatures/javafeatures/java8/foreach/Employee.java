package com.api.java.features.javafeatures.javafeatures.java8.foreach;


public class Employee {
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String empId = "";
    private double salary = 0.0;
    private String grade = "";

    public Employee(String empId, double salary, String grade) {
        this.empId = empId;
        this.salary = salary;
        this.grade = grade;
    }
}