package solid.DIP;

public class Fan implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Turn on the Fan");
    }
}
