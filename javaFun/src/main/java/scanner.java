interface scanner {
	void print();
}


class G implements scanner{
	public void print(){System.out.println("Print something!");}

	public static void main(String args[]){
		G obj = new G();
		obj.print();
	}
}


