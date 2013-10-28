package Labs;

import common.Employee;
import common.EmployeeByLastName;
import java.util.*;

/**
 *
 * @author Freddy Netzlaw
 */
public class Lab6 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "333-33-3333");
        Employee e3 = new Employee("Bill", "Bob", "111-11-1111");
        Employee e4 = new Employee("Billy", "Bobby", "222-22-2222");
        
        Map<Employee, String> employees = new TreeMap<Employee, String>();
        employees.put(e4, "333-33-3333");
        employees.put(e2, "222-22-2222");
        employees.put(e3, "111-11-1111");
        employees.put(e1, "111-11-1111");
        for (Employee employeeKey : employees.keySet()) {
            System.out.println(employeeKey);
            System.out.println(employees.get(employeeKey));
        }

        for (String employeeValue : employees.values()) {
            System.out.println(employeeValue);
        }

        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}
