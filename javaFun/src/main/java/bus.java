interface bus {
	void ticket();
}

class Willer implements bus{
	public void ticket() {
		System.out.println("Two");
	}
	public static void main(String args[]){
		Willer mini = new Willer();
		mini.ticket();
	}
}
