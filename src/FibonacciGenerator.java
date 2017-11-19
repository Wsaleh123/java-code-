
public class FibonacciGenerator {
	private double fold1 = 1;
	private double fold2 = 1;
	private double foldNew;
	
	public FibonacciGenerator() {
		
	}
	
	public double nextNumber() {
		fold1 = fold2;
		fold2 = foldNew;
		foldNew = fold1 + fold2;
		return foldNew;
	}
}
