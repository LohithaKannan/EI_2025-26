import src.*;
public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("John", "001");
        Developer dev2 = new Developer("David", "002");
        Manager mgr1 = new Manager("Robert", "003");
        mgr1.addEmployee(dev1);
        mgr1.addEmployee(dev2);

        Developer dev3 = new Developer("Alice", "004");
        Manager generalManager = new Manager("Michael", "005");
        generalManager.addEmployee(mgr1);
        generalManager.addEmployee(dev3);

        generalManager.showEmployeeDetails();
        /* 
        // Output:
        // 005 Michael
        // 003 Robert
        // 001 John
        // 002 David
        // 004 Alice

        */
    }
}
