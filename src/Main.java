// Import the Scanner util.
import java.util.Scanner;

/** The server class. */
public class Main {

    /** Compiler constructor. */
	public static void main(String[] args) {
		// Instantiate two students and the scanner object.
		Student student1 = new Student();
		Student student2 = new Student();
		Scanner scanner = new Scanner(System.in);

		String name;
		int score;

		// Request information for the first student's data.
		System.out.println("Enter the first student's name.");
		name = scanner.nextLine();
		student1.setName(name);

		for (int i = 1; i <= 3; i++) {
			score = -1;
			
			while (score == -1) {
				System.out.println("Enter one of the student's test scores.");
				score = scanner.hasNextInt() ? scanner.nextInt() : -1;
				// "Reset" the scanner.
				scanner.nextLine();
			}
			student1.setScore(i, score);
		}
		// Request information for the second student's data.
		System.out.println("Enter the second student's name.");
		name = scanner.nextLine();
		student2.setName(name);

		for (int i = 1; i <= 3; i++) {
			score = -1;

			while (score == -1) {
				System.out.println("Enter one of the student's test scores.");
				score = scanner.hasNextInt() ? scanner.nextInt() : -1;
				// "Reset" the scanner.
				scanner.nextLine();
			}
			student2.setScore(i, score);
		}
		// Output the two students' information.
		System.out.println(student1);
		System.out.println(student2);

		// Output which student scored the highest.
		if (student1.getHighScore() > student2.getHighScore()) {
			name = student1.getName();
			score = student1.getHighScore();
		} else {
			name = student2.getName();
			score = student2.getHighScore();
		}
		System.out.println(name + " scored the highest with " + score + " points.");

		// Output which student had the highest average score.
		if (student1.getAverage() > student2.getAverage()) {
			name = student1.getName();
			score = student1.getAverage();
		} else {
			name = student2.getName();
			score = student2.getAverage();
		}
		System.out.println(name + " had the highest average with " + score + " points.");

		// Terminate the scanner runnable.
		scanner.close();
	}
}