package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class StreamDataPractice {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setAge(23);
        student1.setName("Ram");

        List<Integer> marks1 = List.of(60,56,98,21);
        student1.setMarks(marks1);

        Student student2 = new Student();
        student2.setAge(23);
        student2.setName("Shyam");

        List<Integer> marks2 = List.of(60,56,100,21);
        student2.setMarks(marks2);

        students.add(student1);
        students.add(student2);

        Student maxStudent = findStudentWithMaxMarks(students);
        System.out.println(maxStudent);

    }

    public static Student findStudentWithMaxMarks(List<Student> students) {

        Student student = students.stream().max(Comparator.comparingInt(s -> s.getMarks().stream().mapToInt(Integer::intValue).sum())).orElse(null);

        return Objects.requireNonNullElseGet(student, Student::new);
    }


}
