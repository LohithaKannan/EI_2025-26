package src;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String empId;
    private List<Employee> subordinates;

    public Manager(String name, String empId) {
        this.name = name;
        this.empId = empId;
        this.subordinates = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        subordinates.add(emp);
    }

    public void removeEmployee(Employee emp) {
        subordinates.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name);
        for (Employee emp : subordinates) {
            emp.showEmployeeDetails();
        }
    }
}

