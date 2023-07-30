package design.proxy;

public class Main {

    public static void main(String[] args) {

        try{
            Employee employee=new Employee();
            employee.setEmployeeId(1);
            employee.setEmployeeName("Mohan");
            employee.setEmployeeDepartment("IT");
            EmployeeDao empTableObj = new EmployeeDaoProxy();

            empTableObj.create("ADMIN",new EmployeeDo());
            empTableObj.delete("ADMIN",1);
            System.out.println("Operation Successful");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
