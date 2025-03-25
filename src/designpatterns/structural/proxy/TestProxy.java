package designpatterns.structural.proxy;

public class TestProxy {

    public static void main(String[] args) {

        // Here we are creating object of Proxy not the Service Impl
        // Proxy will have the control weather to call the create method or not
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.create("Bhanu");
    }
}
