import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {
	public static void main(String args[]) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));

		Employee4 e2 = (Employee4)in.readObject();
		System.out.println(e2.id+" "+ e2.name+" "+e2.age);
		in.close();
	}
}
