package com.nshindarev.spring.mvc;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String departmant;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", departmant='" + departmant + '\'' +
                '}';
    }

}
