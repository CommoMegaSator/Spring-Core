package com.versatile.spring.pattern.structural;

interface ToProxy{
    void getText();
}

class ToProxyImpl implements ToProxy{

    @Override
    public void getText() {
        System.out.println("Some text...");
    }
}

public class Proxy implements ToProxy{
    ToProxy toProxy = new ToProxyImpl();

    @Override
    public void getText() {
        System.out.println("Proxy code");
        toProxy.getText();
    }
}
