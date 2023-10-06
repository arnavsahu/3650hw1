package hw13560;

public class Answer {
	private Question question;
	private String answer;
	private Student student; 

    public Answer(Student student, String answer) {
        this.student = student;
        this.answer = answer;
    }

    public Student getStudent() {
        return student;
    }

    public String getAnswer() {
        return answer;
    }
    
    public Question getQuestion() {
    	return question; 
    }
}
