public class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static class MyThread1 extends Thread {
		Table t;

		MyThread1(Table t) {
			this.t = t;
		}

		public void run() {
			t.printTable(5);
		}
	}

	static class MyThread2 extends Thread {
		Table t;

		MyThread2(Table t) {
			this.t = t;
		}

		public void run() {
			t.printTable(100);
		}
	}
}

	class TestSynchronization1{
		public static void main(String[] args){
			Table obj = new Table();
			Table.MyThread1 t1= new Table.MyThread1(obj);
			Table.MyThread2 t2= new Table.MyThread2(obj);

			t1.start();
			t2.start();
		}

}
