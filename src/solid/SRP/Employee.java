package solid.SRP;

public class Employee {
    // Voilating Single Responsibility Principle
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // Now below Method are moved to different classes
    // Each class have their own functionality and each have their own responsibility

//    private void calculateSalary() {
//        System.out.println("Current Salary of Employee " + salary);
//    }
//
//    private void generateSalaryReciept() {
//        System.out.println("Generating Salary Reciept for Employee :" + name);
//    }
    // Add Business Logic
    // Now here Class Employee Is handling two Responsiblities which are not part of employee class
}
