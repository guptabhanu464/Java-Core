package oops.association.aggregation;

public class AggregationExample {

    public static void main(String[] args) {

        // Student Object is created Outside the University Object
        // If University Gets Destroyed ,student object will remain independently
        // HAS-A realtionship
        // Weak Relationship
        // Child and Parent Can exist Independently
        Student s1 = new Student("Ram",25);
        Student s2 = new Student("Ramu",26);

        University university = new University("GGSIPU");
        university.addStudent(s1);
        university.addStudent(s2);

        university.showUniversity();
    }
}
