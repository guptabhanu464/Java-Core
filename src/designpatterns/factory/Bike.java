package designpatterns.factory;

public final class  Bike implements Vehicle{

    Bike() {

    }




    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }

    @Override
    public void deAccelerate() {
        System.out.println("Bike is deaccelrating");
    }
}
