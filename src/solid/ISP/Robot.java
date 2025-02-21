package solid.ISP;

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Robot IS WORKING NICELY");
    }

    // Here this method Implemenatation is Unecessary for Robot Class
//    @Override
//    public void eat() {
//        throw new UnsupportedOperationException("Robot Can't eat");
//    }
}
