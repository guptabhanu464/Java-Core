package oops.association.aggregation;

public class Student {

    private String name;
    private Integer rollNo;

    public Student(String name , Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void showStudent() {
        System.out.println("Name of the student :" + name +" roll no is : " + rollNo);
    }

}
