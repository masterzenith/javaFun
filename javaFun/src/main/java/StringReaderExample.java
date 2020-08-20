import java.io.StringReader;

public class StringReaderExample {
	public static void main(String[] args) throws Exception{
		String stg = "Hello Java!!\n welcome to new world";
		StringReader reader = new StringReader(stg);

		int k=0;
		while(((k=reader.read())!=-1)){
			System.out.println((char)k);
		}

	}
}
