
public class counterTester {
	public static void main(String[] args) {
		counter count1 = new counter();
		
		counter count2 = new counter(50);
		
		count1.count();
		
		count2.count(20);
		
		System.out.println("Expected: 1");
		System.out.println(count1.showCounter());
		
		System.out.println("Expected: 70");
		System.out.println(count2.showCounter());
	}


}
