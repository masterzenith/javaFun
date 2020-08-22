package map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> courses = new LinkedHashMap<String, Integer>();
        courses.put("A", new Integer(2));
        courses.put("B", new Integer(5));
        courses.put("C", new Integer(89));

        System.out.println(courses);
        System.out.println("Total courses: "+ courses.size());
        System.out.println("Hadoop contains?: "+ courses.containsKey("Hadoop"));
        System.out.println("Is the map empty: "+ courses.isEmpty());
        System.out.println("Getting value for key B "+ courses.get("B"));
        System.out.println("Delete element 'C'"+ courses.remove("C"));
        System.out.println(courses);

        String searchKey = "A";
        if (courses.containsKey(searchKey)){
            System.out.println("Found total: "+ courses.get(searchKey)+ " "+ searchKey);
        }
    }
}
