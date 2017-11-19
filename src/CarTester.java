
public class CarTester {
	public static void main(String[] args) {
		
		Car myHybrid = new Car(50);
		System.out.println("Expected Gas: 0 -- Actual Gas: " + myHybrid.getGasInTank()); 
		
		//________________________________________________________________________________
		
		myHybrid.addGas(100);
		System.out.println("Expected Gas: 100 -- Actual Gas: " + myHybrid.getGasInTank()); 
		
		//________________________________________________________________________________

		myHybrid.drive(5000);
		System.out.println("Expected Gas: 0 -- Actual Gas: " + myHybrid.getGasInTank()); 

	}

}

/*
	Expected Gas: 0 -- Actual Gas: 0
	Expected Gas: 100 -- Actual Gas: 100
	Expected Gas: 0 -- Actual Gas: 0
*/