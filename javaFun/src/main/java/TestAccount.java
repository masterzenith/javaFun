public class TestAccount {

	public static void main(String args[]){
		Account acc = new Account();
		acc.setAcc_no(78585090L);
		acc.setName("SAJIB GHOSH");
		acc.setEmail("sajibghoshbig@gmail.com");
		acc.setAmount(500000f);

		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}
}
