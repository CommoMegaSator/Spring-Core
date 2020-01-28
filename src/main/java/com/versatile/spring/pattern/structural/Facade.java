package com.versatile.spring.pattern.structural;

class BadCoder{
    public void writeBadCode(){
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
        BadCoder indus = new BadCoder();
        indus.writeBadCode();
    }

    public void writeCleanCode(){
        Developer developer = new Developer();
        developer.writeCleanCode();
    }

}
