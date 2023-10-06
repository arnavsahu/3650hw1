package hw13560;

import java.util.Random;

public class SimulationDriver {
	public static void main(String[] args) {
		String[] answers = {"a","c"};
		String[] options = {"a", "b", "c", "d", "e"};
		Question question = new MCQ(answers);
		Poll poll = new Poll(question);
		
		Random rand = new Random();
		int students = rand.nextInt(50) + 50;
		
		for(int i = 1; i <= students; i++) {
			Student student = new Student(Integer.toString(i));
			String ans = options[rand.nextInt(options.length)];
			student.submitAnswer(ans);
			poll.Submit(student, student.getAnswer());
		}
		poll.Results();
	}
}
