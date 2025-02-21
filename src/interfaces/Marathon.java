package interfaces;

public interface Marathon {

    // Abstract Method
    // Any class which is going to implement this Will have do Implementation as well
    String canRun();

    // Default method Introduced In java 8
    default Integer lengthOfTrack() {
        Integer integer = noOfPeople();
        Integer waterBottle = waterBottles();
        return 10000 + integer + waterBottle;
    }

    // Static method Introduced In java 8
    // Can only access private static method
    // Static method can only access static variables
    static String nameOfTrack() {
        Integer waterBottles = waterBottles();
        return "Delhi Marathon and no of water bottles are : " + waterBottles;
    }

    // Private method Introduced In java 9
    // Increase code readability
    private Integer noOfPeople() {
        return 5000;
    }

    // Private static method Introduced In java 9
    // Can be accessed by both static and default
    private static Integer waterBottles() {
        return 2000;
    }
}
