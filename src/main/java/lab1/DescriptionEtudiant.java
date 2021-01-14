package lab1;


public class DescriptionEtudiant {
	    private int id;
	    private Student student;
	    private int score;
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public DescriptionEtudiant(int id,int score, Student student) {
		this.id = id;
		this.score = score;
		this.student = student;
		
	}

}
