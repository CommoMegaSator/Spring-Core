package com.versatile.spring;

import com.versatile.spring.configuration.SpringConfig;
import com.versatile.spring.pattern.creational.*;
import com.versatile.spring.pattern.structural.Adapter;
import com.versatile.spring.pattern.structural.Bridge;
import com.versatile.spring.uchiha.Uchiha;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    public void usePatterns() throws CloneNotSupportedException {

        System.out.println("\nUsing Factory pattern:");
        UseFactory.useFactoryMethod();

        System.out.println("\nUsing Builder pattern:");
        BuilderPattern builderPattern = new BuilderPattern.myBuilder("mainField").setNumberField(8).build();
        System.out.println(builderPattern.getMainField() + " " + builderPattern.getNumberField() + " " + builderPattern.getElseField());

        System.out.println("\nUsing Singelton pattern:");
        Singelton singelton = Singelton.getInstance();
        singelton.setNumber(1);
        Singelton singelton2 = Singelton.getInstance();
        singelton2.setNumber(3);
        System.out.println(singelton == singelton2);

        System.out.println("\nUsing Prototype pattern:");
        PrototypeUser.usePrototype();

        System.out.println("\nUsing Object Pool pattern:");
        UseObjectPool.useObjectPool();

        System.out.println("\nUsing Adapter pattern:");
        Adapter.useAdapter();

        System.out.println("\nUsing Bridge pattern:");
        Bridge.useBridge();
    }

    public void useBeans(){
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

            User user = context.getBean("user", User.class);
            System.out.println(user.getName() + " " + user.getAge());

            UchihaUse uchihaUse = context.getBean("uchihaUse", UchihaUse.class);
            uchihaUse.showSharingan();

            Uchiha uchiha = context.getBean("itachi", Uchiha.class);
            System.out.println(uchiha.charingan());

            context.close();
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println(ex);
        }
    }

}
