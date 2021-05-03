package Kodlamaio;

public class Student extends User {
 private String courseName;
 
 public Student() {
	 
 }



public Student(int id, String firstName, String lastName, String email, String password, String courseName) {
	super(id, firstName, lastName, email, password);
	this.courseName = courseName;
}



public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}
 
}
