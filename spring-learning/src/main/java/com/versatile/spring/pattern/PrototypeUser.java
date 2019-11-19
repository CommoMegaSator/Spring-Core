//Clones objects

package com.versatile.spring.pattern;

class Prototype implements Cloneable{
    private int number;

    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}

public class PrototypeUser{
    private Prototype prototype;

    public Prototype getPrototype() throws CloneNotSupportedException {
        return prototype.clone();
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public static void usePrototype() throws CloneNotSupportedException {
        PrototypeUser prototypeUser = new PrototypeUser();
        prototypeUser.setPrototype(new Prototype());
        Prototype prototype1 = prototypeUser.getPrototype();
        if (prototype1 == prototype1) System.out.println("Prototype cloned well");
    }
}