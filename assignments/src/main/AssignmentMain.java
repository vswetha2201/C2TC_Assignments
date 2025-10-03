
package main;

import com.swetha_v.assignment1.Employees.Developer;
import com.swetha_v.assignment1.Employees.Manager;
import com.swetha_v.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Ramesh", 101, 75000, "Sales");
        Developer developer = new Developer("Priya", 102, 60000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        util.printEmployeeDetails(manager);
        util.printEmployeeDetails(developer);

        util.increaseSalary(manager, 10);
        util.increaseSalary(developer, 15);
    }
}
