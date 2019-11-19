//Creates only one object

package com.versatile.spring.pattern;

public final class Singelton {

    private static Singelton singelton = new Singelton();
    private int number;

    private Singelton(){};

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static Singelton getInstance(){return singelton;}
}
