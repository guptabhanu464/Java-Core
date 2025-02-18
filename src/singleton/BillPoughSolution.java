package singleton;

public class BillPoughSolution {

    private BillPoughSolution() {

    }

    // Nested Class
    // These nested doesn't get intiated when application is started
    // These get intiated when there method are called
    // This one of most important and famous implementation
    private static class BillPoughHelper {
        // Initiation of Bill Pough Class object
        private static final BillPoughSolution object = new BillPoughSolution();
    }

    public static BillPoughSolution getInstance() {
        return BillPoughHelper.object;
    }
}
