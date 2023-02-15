class Bank { // superclass
	float getrateofinterest() {
 		return 0;
	}	 
} // class bank closed

class SBI extends Bank { //subclass
	float getrateofinterest() { 
		return 8.4f;
	}
}//class SBI closed

class ICICI extends Bank { //subclass
	float getrateofinterest() { 
		return 7.3f;
	}
}//Class ICICI closed

class AXIS extends Bank { //subclass
	float getrateofinterest() { 
		return 9.7f;
	}
}// class AXIS closed

//main class 
class dynamicdispatch { // run time polymorphism
	public static void main(String args[]) {
		Bank B;
		B=new SBI();// Reference variable of superclass bank
		//upcasting by creating reference variable of Superclass which give reference to sub class
		System.out.println("SBI rate of interest="+B.getrateofinterest());
		B=new ICICI();
		System.out.println("ICICI rate of interest="+B.getrateofinterest());
		B=new AXIS();
		System.out.println("AXIS rate of interest="+B.getrateofinterest());
	}
}