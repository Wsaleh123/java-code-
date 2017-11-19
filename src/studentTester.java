
public class studentTester {
	public static void main(String[] args) {
		
		Student kevin = new Student("Kevin");
		System.out.println("Expected Student Name: Kevin -- Actual Student Name: " + kevin.getName());
		
		//____________________________________________________________________________________________
		
		System.out.println("");
		
		kevin.addQuiz(34);
		kevin.addQuiz(30);
		kevin.addQuiz(45);
		kevin.addQuiz(50);
		kevin.addQuiz(10);
		kevin.addQuiz(63);
		
		System.out.println("After adding quiz scores (34,30,45,50,10, and 63) which is a total of 232:");
		System.out.println("	Expected average score: 38 -- Actual Score: " + kevin.getAverageScore()); 
		
		
	}
}

/*
Expected Student Name: Kevin -- Actual Student Name: Kevin

After adding quiz scores (34,30,45,50,10, and 63) which is a total of 232:
	Expected average score: 38 -- Actual Score: 38

*/