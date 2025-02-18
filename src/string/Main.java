package string;

import javaconcepts.GenericClass;

public class Main {
    public static void main(String[] args) {

        // Intiate the employee Class
        //Employee em1 = new Employee(1,"Ram");
        //Employee em2 = new Employee(1 , "Ram");
        // When we try to print the object
        // Java Compiler Runs internally toString() method
        // But we can override toString() method as well
//        System.out.println(em2.toString().equals(em1.toString()));
//        //System.out.println(em2);

        // Concept of Generics
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setItem("AMan");
        String name = genericClass.getItem();
        System.out.println(name);

        // Generics Doesn't work with Primative Data types







    }
}