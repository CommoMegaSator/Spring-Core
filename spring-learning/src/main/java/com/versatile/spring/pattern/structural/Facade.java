package com.versatile.spring.pattern.structural;

class Indus{
    public void writeShirtCode(){
        System.out.println("Writing not clean code...");
    }
}

class Developer{
    public void writeCleanCode(){
        System.out.println("Writing clean code...");
    }
}

public class Facade {

    public void writeShirtCode(){
        Indus indus = new Indus();
        indus.writeShirtCode();
    }

    public void writeCleanCode(){
        Developer developer = new Developer();
        developer.writeCleanCode();
    }

}
