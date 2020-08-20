class Animal {}

class Dog3 extends Animal{
	static void method(Animal a){
			Dog3 d = (Dog3)a; //downcasting
			System.out.println("OK! Down casting is performed");
	}

	public static void main(String args[]){
		Animal a = new Dog3();
		Dog3.method(a);
	}
}

