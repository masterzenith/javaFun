package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<String, Integer>();
        courses.put("Python course.", new Integer(6));
        courses.put("Math course.", new Integer(7));
        courses.put("Data Structure course.", new Integer(5));
        courses.put("Programming course.", new Integer(2));
        System.out.println("Total courses: " + courses.size());

        Set<Map.Entry<String, Integer>> st = courses.entrySet();
        for(Map.Entry<String, Integer> me : st){
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        System.out.println();

        String searchKey = "Math course.";
        if(courses.containsKey(searchKey))
            System.out.println("Found Total " + courses.get(searchKey));
    }
}
