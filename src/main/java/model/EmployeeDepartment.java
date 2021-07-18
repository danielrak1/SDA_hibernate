package model;

public class EmployeeDepartment {
    private int employeeId;
    private String employeeName;
    private int salary;
    private String departmentName;

    public EmployeeDepartment(int employeeId, String employeeName, int salary, String departmentName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
