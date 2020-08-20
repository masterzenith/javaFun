import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student3 {
	public static void main(String args[]) throws Exception{
		Employee4 s1 = new Employee4(1,"sa", 5);
		FileOutputStream f = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();


		out.close();
		f.close();
		System.out.println("success");
	}
}
