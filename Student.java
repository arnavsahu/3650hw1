package hw13560;

public class Student {
	private String id;
	private String answer;
	
	public Student(String id) {
		this.id = id;
	}
	public String getId() {
		return id; 
	}
	public String getAnswer() {
		return answer;
	}
	public void submitAnswer(String answer) {
		this.answer = answer;
	}
}
