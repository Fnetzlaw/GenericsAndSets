package Labs;

import common.Employee;
import java.util.*;

public class Lab5 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "333-33-3333");
        Employee e3 = new Employee("Bill", "Bob", "111-11-1111");
        Employee e4 = new Employee("Billy", "Bobby", "222-22-2222");

       
        Map<String, Employee> employees = new HashMap<String, Employee>();
        //the key I use is the SSn because it is unique for that person.
        employees.put("111-11-1111", e1);
        employees.put("333-33-3333", e2);
        employees.put("111-11-1111", e3);
        employees.put("222-22-2222", e4); 
        
//        employees.put(e1.getSsn(), e1);
//        employees.put(e2.getSsn(), e2);
//        employees.put(e3.getSsn(), e3);
//        employees.put(e4.getSsn(), e4);

        Employee getAEmployee = (Employee) employees.get("111-11-1111");
        System.out.println(getAEmployee + "\n");
        
        for (Employee employeeValue : employees.values()) {
            System.out.println(employeeValue);
        }



    }
}
