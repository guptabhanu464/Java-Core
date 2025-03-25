package designpatterns.structural.proxy;

public class EmployeeServiceImpl implements EmployeeDao{

    @Override
    public void create(String name) {
        System.out.println("Employee with name : " + name + " is created ");
    }
}
