import java.io.Serializable;

public class Employee4 implements Serializable {
	int id;
	String name;
	transient int age;

	public Employee4(int id, String name, int age){
		this.id= id;
		this.name=name;
		this.age= age;

	}

}
