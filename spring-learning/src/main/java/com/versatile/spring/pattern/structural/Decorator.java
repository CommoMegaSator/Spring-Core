package com.versatile.spring.pattern.structural;

interface ToDecorate{
    void decorateMethod();
}

class ToDecorateImpl implements ToDecorate{
    @Override
    public void decorateMethod() {
        System.out.println("Before Decorating");
    }
}

abstract class DecorateFather implements ToDecorate{

    protected ToDecorate toDecorate;

    public DecorateFather(ToDecorate toDecorate) {
        this.toDecorate = toDecorate;
    }

    public abstract void decorateMethod();
}

class DoDecorate extends DecorateFather{

    public DoDecorate(ToDecorate toDecorate) {
        super(toDecorate);
    }

    @Override
    public void decorateMethod() {
        toDecorate.decorateMethod();
        System.out.println("After Decorating");
    }
}

public class Decorator {

    public void useDecorator(){
        ToDecorate toDecorate = new DoDecorate(new ToDecorateImpl());
        toDecorate.decorateMethod();
    }
}
