package src;

public class Developer implements Employee {
    private String name;
    private String empId;

    public Developer(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name);
    }
}

