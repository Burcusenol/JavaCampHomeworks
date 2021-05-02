package oopOdev;

public class Course {

	public Course() {
		System.out.println("Constructor worked.");
	}
	
	public Course(int id,String name,String instructorName,String courseDetail) {
		
		this.id=id;
		this.name=name;
		this.instructorName=instructorName;
		this.courseDetail=courseDetail;
	}
	int id;
	String name;
	String instructorName;
	String courseDetail;
}
