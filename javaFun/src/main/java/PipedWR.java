import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedWR {
	public static void main(String args[]) throws Exception{
		final PipedOutputStream pout = new PipedOutputStream();
		final PipedInputStream pin = new PipedInputStream();

		pout.connect(pin);

		Thread t1 = new Thread(() -> {
			try {
				for (int i = 65; i <= 90; i++) {
				}
			} catch (Exception e){}
		});

		Thread t2 = new Thread(() -> {
			try{
				for (int i = 65; i <= 90; i++) {
					System.out.println(pin.read());
				}
			} catch (Exception e){}
		});


		//starting of both of the thread
		t1.start();
		t2.start();
	}
}
