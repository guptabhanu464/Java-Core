package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws Exception {

        Student student = new Student();
        student.setName("Bhanu");
        student.setRollNo(1);

        Class<?> clas = student.getClass();

//        Field name = clas.getDeclaredField("name");
//        Field rollNo = clas.getDeclaredField("rollNo");
//
//
//        name.setAccessible(true); // Bypass private
//        name.set(student ,"Ram"); // Here we have changed the value of Field
//        rollNo.setAccessible(true);
//        rollNo.set(student , 100);

        Method getStudentDetails = clas.getDeclaredMethod("getStudentDetails" , String.class , Integer.class);
        getStudentDetails.setAccessible(true);
        getStudentDetails.invoke(student , "Ram" , 100);
        //System.out.println(getStudentDetails);
       // String studentDetails = student.getStudentDetails();
        //System.out.println(studentDetails);

    }
}
