package solid.LSP;

public class TestLSP {

    public static void main(String[] args) {

        // Code voilating LSP
        /*
        Bird bird = new Bird();
        bird.canFly();

        Bird bird1 = new Penguin(); // Here if anyone have the subtype of Bird call its fly method functionality will break
        bird1.canFly();
         */
        // Following LSP
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.canMove();
        penguin.canMove();
    }
}
