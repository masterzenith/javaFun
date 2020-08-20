import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
	public static void main(String args[]){
		Map<Integer,String> map2 = new HashMap<Integer, String>();
		map2.put(100,"Sajib");
		map2.put(200,"Rajib");
		map2.put(300,"Ruma");


		map2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}
