/** Manages a student's name and three test scores. */
public class Student {

	// Student Name and Test Scores
	private String name;
	private int test1;
	private int test2;
	private int test3;

	/** Class constructor. */
	public Student() {
		// Initialize a new student's name to the empty string and the test scores to
		// zero.
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}

    /** Construct and return a string representation of the student. */
	public String toString() {
		return "Name: " + name + "\n" +
        "Score on first test: " + test1 + "\n" +
        "Score on second test: " + test2 + "\n" +
        "Score on third test: " + test3 + "\n" +
        "Average score: " + getAverage();
	}

	/** Sets the member variable of the student's name to the parameter. */
	public void setName(String name) {
		this.name = name;
	}

	/** Returns the student's name. */
	public String getName() {
		return name;
	}

	/** Sets a test score to the given test number. */
	public void setScore(int test, int score) {
		if (test == 1)
			test1 = score;
		else if (test == 2)
			test2 = score;
		else
			test3 = score;
	}

	/** Retrieve the score based on the test number. */
	public int getScore(int test) {
		if (test == 1)
			return test1;
		else if (test == 2)
			return test2;
		else
			return test3;
	}

	/**
     * Calculates the average of the three scores,
     * rounded to the nearest whole value.
	 */
	public int getAverage() {
		return (int) Math.round((test1 + test2 + test3) / 3.0);
	}

	/** Determines the highest of the three test scores. */
	public int getHighScore() {
		int highScore = test1;

		if (test2 > highScore)
			highScore = test2;
		if (test3 > highScore)
			highScore = test3;

		return highScore;
	}
}