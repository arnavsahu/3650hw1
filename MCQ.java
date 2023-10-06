package hw13560;

public class MCQ extends Question{
	public MCQ(String[] answers) {
		super(answers);
	}
	
	public boolean Correct(String answer) {
		for(String ans : answers) {
			if(ans.equals(answer)) {
				return true;
			}
		}
		return false; 
	}
}
