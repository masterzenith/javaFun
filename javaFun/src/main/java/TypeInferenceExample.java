import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {
	public static void showList(List<Integer>list){
		if (!list.isEmpty()) {
			list.forEach(System.out::println);
		} else {
			System.out.println("list is empty");
		}
	}


	public static void main(String[] args){
		//Old approach(prior to Java 7) to create a list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);

		//Java7 infers type to a new array list
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		showList(list2);

		//compiler infers type of array list in Java8
		showList(new ArrayList<>());
	}
}
