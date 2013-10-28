package Labs;

import common.Employee;
import common.EmployeeByLastName;
import java.util.*;

/**
 *
 * @author Freddy Netzlaw
 */
public class Lab7 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Netzlaw", "Freddy", "111-11-1111");
        Employee e2 = new Employee("Bob", "Bill", "333-33-3333");
        Employee e3 = new Employee("Bill", "Bob", "111-11-1111");
        Employee e4 = new Employee("Billy", "Bobby", "222-22-2222");

        Set<Employee> newTreeSet = new TreeSet<Employee>();
        newTreeSet.add(e1);
        newTreeSet.add(e2);
        newTreeSet.add(e3);
        newTreeSet.add(e4);


//      //reg output for just the list
//        System.out.println("\n");
//        for (Employee e : newTreeSet) {
//            System.out.println(e);
//        }

        //take the set and put it into a list
        List<Employee> lastNameList = new ArrayList<Employee>(newTreeSet);
        Collections.sort(lastNameList, new EmployeeByLastName());


        System.out.println("\n");
        for (Employee e : lastNameList) {
            System.out.println(e);
        }
    }
}
