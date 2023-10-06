package hw13560;

import java.util.HashMap;
import java.util.Map;

public class Poll {
	private Question question; 
	private Map<String, String> submissions;
	
	public Poll(Question question) {
		this.question = question; 
		this.submissions = new HashMap<>();
	}
	
	public void Submit(Student id, String answer) {
		if(question.Correct(answer)) {
			submissions.put(id.getId(), answer);
		} else {
			System.out.println("Student " + id.getId() + " has submitted the wrong answer.");
		}
	}
	
	public void Results() {
		Map<String, Integer> results = new HashMap<>(); 
		for(String answer : submissions.values()) {
			results.put(answer, results.getOrDefault(answer,  0) + 1);
		}
		for (String ans : question.answers) {
            System.out.println(ans + ": " + results.getOrDefault(ans, 0));
        }
	}
}
