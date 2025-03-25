package designpatterns.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao; // HAS-A Relationship

    EmployeeDaoProxy() {
        employeeDao = new EmployeeServiceImpl(); // Object created here
    }



    @Override
    public void create(String name) {

        if(name.equals("Bhanu")) {
            employeeDao.create(name);
        } else {
            System.out.println("This name is not present");
        }
    }
}
