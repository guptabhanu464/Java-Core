package reflection;

public class Student {

    private String name;
    private Integer rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public void getStudentDetails(String name , Integer rollNo) {

        System.out.println("Name of the student : " + name + " roll no of student : " + + rollNo);
    }
}
