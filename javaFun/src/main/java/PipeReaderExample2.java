import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReaderExample2 {
	public static void main(String[] args){
		try{
			final PipedReader read = new PipedReader();
			final PipedWriter write = new PipedWriter(read);

			Thread readerThread = new Thread(() -> {
				try {
					int data = read.read();

			} catch(Exception ex){

		}
	});
			Thread writeThread = new Thread(() -> {
				try{
					write.write("I love my country\n".toCharArray());
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			readerThread.start();
			writeThread.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

