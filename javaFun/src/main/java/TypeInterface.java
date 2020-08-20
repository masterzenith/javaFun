class GenericClass<X>{
	<T> GenericClass(T t){
		System.out.println(t);
	}
}



public class TypeInterface {
	public static void main(String[] args){

		GenericClass<String> str = new GenericClass<>("Hello");
	}
}
