package map;

import java.util.HashMap;
import java.util.Hashtable;

public class My_Dictionary {
    public static void main(String[] args){
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("01", "A");
        my_dict.put("02", "B");
        my_dict.put("03", "C");
        System.out.println("\nValue at key = 03 : "+ my_dict.get("03"));
        System.out.println("\nValue at key = 04 : "+ my_dict.get("04"));

        System.out.println("\nIs my dictionary empty? : "+ my_dict.isEmpty()+ "\n");

        my_dict.remove("02");
        System.out.println("Checking if removed value exists: "+ my_dict.get("02"));

        System.out.println("\nSize of my_dict : "+my_dict.size());
    }
}
