import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics2 {
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "vijay");
		map.put(2, "umesh");
		map.put(3, "ankit");

		Set<Map.Entry<Integer, String>> set = map.entrySet();

		Iterator<Map.Entry<Integer,String>> itr = set.iterator();

		while(itr.hasNext()){
			Map.Entry e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
