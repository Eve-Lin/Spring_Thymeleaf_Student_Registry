package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class StudentBindingModel {


    private String name;
    private Integer age;
    private Integer number;

    public StudentBindingModel() {
    }

    public StudentBindingModel(String name, Integer age, Integer number) {

        this.name = name;
        this.age = age;
        this.number = number;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
