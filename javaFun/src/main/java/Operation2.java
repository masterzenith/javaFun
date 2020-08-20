public class Operation2 {
	int data=50;

	void change(Operation2 operation2){
		operation2.data = operation2.data+100;
	}

 public static void main(String[] args){
		Operation2 operation2 = new Operation2();
	 System.out.println("before change:"+ operation2.data);
	 operation2.change(operation2);
	 System.out.println("after change:"+operation2.data);
 }

}



