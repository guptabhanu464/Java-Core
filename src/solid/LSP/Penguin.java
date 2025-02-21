package solid.LSP;

public class Penguin extends Bird {


    // Here we are violating the LSP Principle
//    @Override
//    void canFly() {
//        throw new RuntimeException("Penguin Cannot fly");
//    }

    // Correct Version of LSP
    @Override
    void canMove() {
        System.out.println("Penguin is moving freely");
    }

}
