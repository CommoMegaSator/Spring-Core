package com.versatile.spring;

import com.versatile.spring.pattern.creational.Singelton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringLearningApplicationTests {

    @Test
    void testSingelton() {
        Singelton singelton = Singelton.getInstance();
        singelton.setNumber(1);
        Singelton singelton2 = Singelton.getInstance();
        singelton2.setNumber(3);
        assertSame(singelton, singelton2);
    }

    @BeforeAll
    static void startTest(){
        System.out.println("-------------------------------Start testing--------------------------------");
    }

    @AfterAll
    static void finishTest(){
        System.out.println("-------------------------------Finish testing-------------------------------");
    }

}
