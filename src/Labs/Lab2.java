package Labs;

import common.Employee;
import java.util.*;

/**
 *
 * @author Freddy Netzlaw
 */
public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "222-22-2222");
        Employee e3 = new Employee("Bill", "Bob", "333-33-3333");
        
        List<Employee> employees = new Vector<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for(Employee s : employees){
            System.out.println(s);
        }
        
        
    }
}
