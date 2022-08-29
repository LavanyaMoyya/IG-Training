package com.abstraction;

abstract class Bank{
	abstract int getRateofInterest();
}

class SBI extends Bank{

	@Override
	int getRateofInterest() {
		return 7;
	}
}
class PNB extends Bank{

	@Override
	int getRateofInterest() {
		return 8;
	}
	
}

public class AbstractMethodDemo {
public static void main(String[] args) {
	Bank b;
	b=new SBI();
	System.out.println("Rate of Inteterest of SBI: " +b.getRateofInterest()+"%");
	b=new PNB();
	System.out.println("Rate of Inteterest of PNB: " +b.getRateofInterest()+"%");
	
}
}
