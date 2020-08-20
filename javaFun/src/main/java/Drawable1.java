interface Drawable1 {
	void draw();
	default void msg(){System.out.println("default msg");}
}

class Square implements Drawable1{
	public void draw() {
		System.out.println("drawing square");
	}
}


class A9{
	public static void main(String args[]){
		Drawable1 d = new Square();
		d.draw();
		d.msg();
	}
}
