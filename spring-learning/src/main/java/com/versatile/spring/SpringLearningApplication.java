package com.versatile.spring;

import com.versatile.spring.configuration.SpringConfig;
import com.versatile.spring.pattern.UseFactory;
import com.versatile.spring.uchiha.Uchiha;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringLearningApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UseFactory.useFactoryMethod();

        try {
            Uchiha uchiha = context.getBean("itachi", Uchiha.class);
            UchihaUse uchihaUse = context.getBean("uchihaUse", UchihaUse.class);
            User user = context.getBean("user", User.class);

            System.out.println(user.getName() + " " +user.getAge());
            uchihaUse.showSharingan();
            System.out.println(uchiha.charingan());

            context.close();
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println(ex);
        }
    }

    private void useFactoryMethod(){

    }

}
