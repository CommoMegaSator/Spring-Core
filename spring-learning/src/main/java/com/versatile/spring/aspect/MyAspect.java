package com.versatile.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.versatile.spring.uchiha.Uchiha.charingan(..))")
    public void charinganAspect(){

    }

    @Before("charinganAspect()")
    public void beforeMethod(JoinPoint joinPoint){
        System.out.println("Suka blyat before aspect" + joinPoint.getSignature());
    }

    @After("charinganAspect()")
    public void afterMethod(JoinPoint joinPoint){
        System.out.println("Suka blyat after aspect" + joinPoint.getSignature());
    }
}
