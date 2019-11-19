package com.versatile.spring;

//@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
//        SpringApplication.run(SpringLearningApplication.class, args);
        Starter starter = new Starter();
        starter.usePatterns();
    }

}
