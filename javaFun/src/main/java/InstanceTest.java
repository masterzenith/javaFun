public class InstanceTest {
	public static void main(String args[]){
		System.out.println("Hashcode test of String:");
		String str ="Java";
		System.out.println(str.hashCode());
		str+="tpoint";
		System.out.println(str.hashCode());

		System.out.println("Hashcode test of String Buffer:");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		sb.append("tpoint");
		System.out.println(sb.hashCode());
	}
}
