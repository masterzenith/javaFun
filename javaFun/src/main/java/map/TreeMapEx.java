package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args){
        Map<String, Integer> courses = new TreeMap<String, Integer>();
        courses.put("Java Programming",new Integer(2));
        courses.put("B",new Integer(52));
        courses.put("C",new Integer(25));

        System.out.println("Total courses: " + courses.size());

        Set<Map.Entry<String, Integer>> st = courses.entrySet();
        for (Map.Entry<String, Integer> mt : st){
            System.out.print(mt.getKey()+":");
            System.out.println(mt.getValue());
        }

        String searchKey = "B";
        if(courses.containsKey(searchKey))
            System.out.println("Found total: " + courses.get(searchKey) + " "+ searchKey);
    }
}
