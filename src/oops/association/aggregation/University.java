package oops.association.aggregation;

import java.util.ArrayList;
import java.util.List;

class University {

    private String name;
    private List<Student> students; // Aggregation University Has Students
    // University HAS-A Student
    // Student HAS-A University

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showUniversity() {
        System.out.println("Name of the University : " + name);
        for (Student s : students) {
            s.showStudent();
        }
    }

}
