package solid.LSP;

public class Bird {

    // Voilating LSP
//    void canFly() {
//        System.out.println("Bird Is flying");
//    }

    void canMove() {
        System.out.println("Bird is Flying and Moving");
    }
}
