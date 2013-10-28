package Labs;

import common.Employee;
import java.util.*;

public class Lab3 {

    public static void main(String[] args) {
     
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "333-33-3333");
        Employee e3 = new Employee("Bill", "Bob", "111-11-1111");
        Employee e4 = new Employee("Billy", "Bobby", "222-22-2222");

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("\n");

        List<Employee> employeeLists = new ArrayList<Employee>(employees);
        Employee myEmployee = employeeLists.get(2);

        System.out.println(myEmployee);





    }
}
