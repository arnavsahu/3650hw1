package hw13560;

public abstract class Question {
	protected String[] answers;
	
	public Question(String[] answers) {
		this.answers = answers;
	}
	
	public abstract boolean Correct(String answer);
}
