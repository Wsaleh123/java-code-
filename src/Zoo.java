
public class Zoo {
	String name;
	String color;
	String species;
	String gender;
	String height;
	String weight;
	String age;
	
	public Zoo(String name, String color, String species, String gender, String height, String weight, String age) {
		super();
		this.name = name;
		this.color = color;
		this.species = species;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + color);
		System.out.println("I am also a " + gender + " " + species);
		System.out.println("Here is my number information");
		System.out.println("Weight: " + weight);
		System.out.println("Height: " + height);
		System.out.println("Age: " + age);

	}
	
	public void bark() {
		System.out.println("Woof Woof...");
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void fly() {
		System.out.println("flying...");
	}
	
	public void run() {
		System.out.println("running...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	
	public void crawl() {
		System.out.println("crawling...");
	}
	
	
}
