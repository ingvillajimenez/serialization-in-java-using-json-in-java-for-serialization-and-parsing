package com.skillsoft.jsonparsing;

import org.json.JSONPropertyName; // @interface JSONPropertyName
import org.json.JSONPropertyIgnore; // @interface JSONPropertyIgnore

import java.math.BigInteger; // class BigInteger

public class EmployeeBean {

    private BigInteger id;
    private String name;
    private String title;
    private double salary;
    private int age;

    public EmployeeBean() {
    }

    public EmployeeBean(BigInteger id, String name, String title, double salary, int age) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.age = age;
    }

    @JSONPropertyName("employee_id")
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @JSONPropertyName("full_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JSONPropertyName("designation")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JSONPropertyIgnore
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @JSONPropertyIgnore
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
