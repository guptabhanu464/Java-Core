package solid.ISP;

public class Human implements Workable,Eatable{

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void work() {
        System.out.println("Human is working");
    }
}
