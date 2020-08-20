interface A {
	void a();
	void b();
	void c();
	void d();
}


abstract class B implements A{
	public void c(){System.out.println("I'm C");}
}

class M extends B{
	public void a(){System.out.println("I'm A");}
	public void b(){System.out.println("I'm B");}
	public void d(){System.out.println("I'm D");}
}


class Test{
	public static void main(String args[]){
		A a = new M();

		a.a();
		a.b();
		a.c();
		a.d();
	}
}