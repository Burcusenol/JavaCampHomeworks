package Kodlamaio;

public class Instructor extends User {
	private int instructorNumber;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, int instructorNumber) {
		super(id, firstName, lastName, email, password);
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
}
