abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank{
	int getRateOfInterest(){return 7;}
}

class PNB extends Bank{
	int getRateOfInterest(){return 8;}
}

class TestBank{
	public static void main(String[]args){
		SBI b;
		b = new SBI();
		System.out.println("Rate of interest: "+ b.getRateOfInterest()+ "%");

		PNB c;
		c = new PNB();
		System.out.println("Rate of interest: "+ c.getRateOfInterest()+ "%");
	}
}
