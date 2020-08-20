import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args){
		List<Book> list = new LinkedList<Book>();

		Book b1 = new Book(1,"New Life","SG","FL", 6);
		Book b2 = new Book(1,"New Life","SG","FL", 6);
		Book b3 = new Book(1,"New Life","SG","FL", 6);

		list.add(b1);
		list.add(b2);
		list.add(b3);


		for (Book book : list){
			System.out.println(book.id+" "+ book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
		}
	}
}
