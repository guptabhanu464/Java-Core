package designpatterns.creational.factory;

class Bike implements Vehicle{


    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }

    @Override
    public void deAccelerate() {
        System.out.println("Bike is deaccelrating");
    }
}
