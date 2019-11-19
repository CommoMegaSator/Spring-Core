package com.versatile.spring.pattern;

interface Kage{
    String village();
}

class Naruto implements Kage{

    @Override
    public String village() {
        return "Konoha";
    }
}

class TerumiMey implements Kage{
    @Override
    public String village() {
        return "Tuman";
    }
}

interface FactoryMethod {
    Kage createKage();
}

class CreateTerumi implements FactoryMethod{

    @Override
    public Kage createKage() {
        return new TerumiMey();
    }
}

class CreateNaruto implements FactoryMethod{
    @Override
    public Kage createKage() {
        return new Naruto();
    }
}

public class UseFactory{
    public static void useFactoryMethod(){
        Kage kage = chooseKage("Naruto");
        if(kage != null)System.out.println(kage.village());
    }

    private static Kage chooseKage(String name){
        switch (name){
            case "Naruto": return new CreateNaruto().createKage();
            case "Terumi": return new CreateTerumi().createKage();
            default: return null;
        }
    }
}