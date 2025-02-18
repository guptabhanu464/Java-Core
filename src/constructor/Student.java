package constructor;

public class Student {

    private String name;

    private Integer rollNo;

    // Method Overloading is done over here
    public Student() {
        this.name = "Shyam";
        this.rollNo = 1;
    }

    // Parametrized Constructor - It is type of constructor where parameters are present
    public Student(String name , int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Copy Constructor
    // Here we can provide object as parameter to make a copy of other object
    public Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
    }




    public String toString() {

        return "Name of the student :" + name + "and roll no :" + rollNo;
    }
}
