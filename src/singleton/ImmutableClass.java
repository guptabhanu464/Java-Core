package singleton;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    // When creating immutable class final keyword should be present

    private final String name;
    private final List<String> designation;


    // Constructor is there
    // Hence no one can intialized from outside
    ImmutableClass(String name , List<String> designation) {
        this.name = name;
        this.designation = designation;
    }

    // No setter method is there
    // Only getter method

    public String getName() {
        return name;
    }

    public List<String> getDesignation() {
        return new ArrayList<>(designation);

        // Always return copy of the variable
    }
}
