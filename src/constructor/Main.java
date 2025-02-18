package constructor;

public class Main {

    public static void main(String[] args) {

        // Now in student class we have not defined any constructor
        // Java explicitly provide default constructor with no arguements
        Student student = new Student();
        System.out.println(student);

        Student student1 = new Student("Ram", 10);
        System.out.println(student1);

        Student student2 = new Student(student1);
        System.out.println(student2);

    }
}
