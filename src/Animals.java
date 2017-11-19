
public class Animals {
	public static void main(String[] args) {
		
		Zoo Tom = new Zoo("Tom", "blue", "bird", "male", "10 in", "10 lbs", "14 yrs old");
		Zoo Alison = new Zoo("Alison", "white", "human", "female", "30 in", "15 lbs", "1 yr old");
		Zoo lightning = new Zoo("Lightning", "brown", "dog", "male", "20 in", "50 lbs", "20 yrs old");
		
		Tom.speak();
		Tom.eat();
		Tom.fly();
		Tom.sleep();
		
		System.out.println("");
		
		Alison.speak();
		Alison.eat();
		Alison.crawl();
		Alison.walk();
		Alison.sleep();
		
		System.out.println("");
		
		lightning.speak();
		lightning.walk();
		lightning.run();
		lightning.bark();
		lightning.sleep();
	}
}
