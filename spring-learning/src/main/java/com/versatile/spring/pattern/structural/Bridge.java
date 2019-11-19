//Helps do not use a lot of classes

package com.versatile.spring.pattern.structural;

public class Bridge {
    public static void useBridge(){
        Computer computer = new Notebook(new Dell());
        computer.use();
    }
}

abstract class Computer{
    protected Model model;

    public Computer(Model model){
        this.model = model;
    }

    abstract void use();
}

class Notebook extends Computer{
    public Notebook(Model model){
        super(model);
    }

    @Override
    void use() {
        model.use("Use Notebook");
    }
}

interface Model{
    void use(String string);
}

class Dell implements Model{

    @Override
    public void use(String string) {
        System.out.println(string + " Dell");
    }
}