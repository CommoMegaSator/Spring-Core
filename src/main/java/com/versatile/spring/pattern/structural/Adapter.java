package com.versatile.spring.pattern.structural;

interface Car{
    void wash();
}

class Audi implements Car{
    @Override
    public void wash() {
        System.out.println("Washing Audi");
    }
}

interface Track{
    void clean();
}

class MyTrack implements Track{
    @Override
    public void clean() {
        System.out.println("Cleaning Track");
    }
}

class TrackWrap implements Car{
    Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}

class CarWash{
    public void washCar(Car car){
        car.wash();
    }
}

public class Adapter {
    public static void useAdapter(){
        CarWash carWash = new CarWash();
        carWash.washCar(new TrackWrap(new MyTrack()));
    }
}
