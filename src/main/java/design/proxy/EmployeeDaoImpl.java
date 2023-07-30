package design.proxy;

public class EmployeeDaoImpl implements  EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Creation new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employeeId :"+employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Creation new row in the employee table");
        return new EmployeeDo();
    }
}
