package design.proxy;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeDepartment;

    public Employee(int employeeId,String employeeName,String employeeDepartment) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeDepartment=employeeDepartment;
    }

    public Employee() {
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
}
