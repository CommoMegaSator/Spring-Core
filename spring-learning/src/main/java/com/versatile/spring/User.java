package com.versatile.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {
    @Value("${username}")
    private String name;

    @Value("${userage}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @PostConstruct
    public void doUserInit(){
        System.out.println("User Initialization");
    }

    @PreDestroy
    public void doUserDestroy(){
        System.out.println("User Destroy");
    }
}
