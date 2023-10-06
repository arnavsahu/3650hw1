package hw13560;

public class TrueOrFalse extends Question{
	public TrueOrFalse(String[] answers) {
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
