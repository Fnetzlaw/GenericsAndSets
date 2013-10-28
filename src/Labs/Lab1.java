package Labs;

import java.util.*;

/**
 *
 * @author Freddy Netzlaw
 */
public class Lab1 {
    public static void main(String[] args) {
        
        
        List hobbies = new Vector();
        hobbies.add("Fishing");
        hobbies.add("Shooting");
        hobbies.add("Video Games");
        hobbies.add("Sleeping");
        
        for(int i = 0; i < hobbies.size();i++){
        Object obj = hobbies.get(i);
        String item = (String)obj;
        System.out.println(item);
        }
        
    }
}
