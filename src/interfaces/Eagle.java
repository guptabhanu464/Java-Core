package interfaces;

public class Eagle implements Bird{
    @Override
    public void canFly() {
        System.out.println("Eagle is flying High");
    }

    public static void main(String[] args) {

        // Anonymous Class
//        Bird eagle = new Bird(){
//            @Override
//            public void canFly() {
//                System.out.println("Eagle is flying high in sky");
//            }
//        };
//        eagle.canFly();

        // Using Lambda Experssion
        // Lambda Expression Way To implement Functional Interfaces
        Bird eagle = () -> {
            System.out.println("Eagle Is Flying High is Sky very much");
        };

        eagle.canFly();
    }
}
