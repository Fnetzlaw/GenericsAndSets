package Labs;

import common.Employee;
import java.util.*;

/**
 *
 * @author Freddy Netzlaw
 */
public class Lab4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "222-22-2222");
        Employee e3 = new Employee("Bill", "Bob", "111-11-1111");
        
        Set<Employee> mySet = new HashSet<Employee>();
        mySet.add(e1);
        mySet.add(e2);
        mySet.add(e3);
        
        
        List<Employee> list = new ArrayList<Employee>(mySet);
        for(Employee e : list){
            System.out.println(e);
        }
    }
}
