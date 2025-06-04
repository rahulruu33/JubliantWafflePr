package testPackage;

public class Employee {

    private String empName;

    private String dept;

    private Integer salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String empName, String dept, Integer salary) {
        this.empName = empName;
        this.dept = dept;
        this.salary = salary;
    }
}
