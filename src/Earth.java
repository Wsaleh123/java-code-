
public class Earth {
	
	public static void main(String args[]) {
		Human human1 = new Human("Joe Smith", 13, 70, "green");
		Human human2 = new Human("Alyssa Adams", 25, 100, "sky blue");
		Human human3 = new Human("Old Man", 78, 62, "maroon");

		
		human1.speak();
		System.out.println("");
		human2.speak();
		System.out.println("");
		human3.speak();

	}

}
