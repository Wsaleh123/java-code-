
public class Student {
	/**
	 * @author Wesam Saleh
	 * @version 1.0
	 * Class that creates a student and computes the number of quizzes the student took, the score for each of them combined, and the average score
	 */
	private int totalQS;
	private String studentName;
	private int numOfQ;
	
	/**
	 * Creates a student and stores the name that was passed and sets the total score to 0
	 * @param name The student's name
	 */
	public Student(String name) {
		studentName = name;
		totalQS = 0;
	}
	
	/**
	 * Returns the name of the student
	 */
	public String getName() {
		return studentName;
	}
	
	/**
	 * Adds a quiz to the total number of Quizzes, and the score to the total score
	 * @param score Score of the Quiz added 
	 */
	public void addQuiz(int score) {
		totalQS = totalQS + score;
		numOfQ++;
	}
	
	/**
	 * Returns the average score (calculated by dividing the total Quiz score by the number of Quizzes
	 */
	public int getAverageScore() {
		return (totalQS/numOfQ);
	}

}
