package com.versatile.spring;

import com.versatile.spring.configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
//        SpringApplication.run(SpringLearningApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Starter starter = new Starter();
        starter.usePatterns();
    }

}
