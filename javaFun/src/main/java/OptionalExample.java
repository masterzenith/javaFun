import java.util.Optional;

public class OptionalExample {
	public static void main(String args[]){
		String[] str = new String[10];

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		} else {
			System.out.println("string is not present");
		}
	}
}
