interface Showable {
	void print();
}

interface Printable1{
	void print();
}


class A8 implements Printable1, Showable{
	public void print() {
		System.out.println("print");
	}

	public static void main(String args[]){
		A8 a8 = new A8();
		a8.print();

	}
}