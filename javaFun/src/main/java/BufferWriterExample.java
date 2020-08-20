import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterExample {
	public static void main(String[] args) throws Exception{
		FileWriter writer= new FileWriter("Desktop:\\testWriter.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("welcome to java world and");
		buffer.close();
		System.out.println("Success");
	}
}
