public class FinalizedExample {
	public void finalize(){System.out.println("finalize called");}
	public static void main(String[] args){
		FinalizedExample f1 = new FinalizedExample();
		FinalizedExample f2 = new FinalizedExample();

		f1= null;
		f2=null;
		System.gc();
	}
}
