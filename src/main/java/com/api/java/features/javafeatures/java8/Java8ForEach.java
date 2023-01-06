package com.api.java.features.javafeatures.java8;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {
    public static void main(String[] args) {

        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }

        });

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        List<Employee> employees = new ArrayList();
        employees.add(new Employee("e1", 25000, "D"));
        employees.add(new Employee("e2", 23000, "D"));
        employees.add(new Employee("e3", 40000, "C"));
        employees.add(new Employee("e4", 35000, "C"));
        employees.add(new Employee("e5", 15000, "E"));
        employees.add(new Employee("e6", 55000, "A"));
        employees.add(new Employee("e7", 47000, "B"));

        employees.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println("employee in foreach consumer " + employee.getEmpId() + " / " + employee.getSalary() + " / " + employee.getGrade());
            }
        });

    }
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }
}

@Getter
@Setter
class Employee {
    private String empId = "";
    private double salary = 0.0;
    private String grade = "";

    public Employee(String empId, double salary, String grade) {
        this.empId = empId;
        this.salary = salary;
        this.grade = grade;
    }
}