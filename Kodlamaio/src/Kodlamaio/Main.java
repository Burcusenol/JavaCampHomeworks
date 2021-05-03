package Kodlamaio;



public class Main {

	
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Ali");
		student.setLastName("Ay");
		student.setEmail("aliay@gmail.com");
		student.setPassword("123456");
		student.setCourseName("C#");
		
		StudentManager studentManager=new StudentManager();
	    studentManager.add(student);
		
		System.out.println("***********************");
		
		Instructor instructor=new Instructor(1,"Engin","Demiroğ","engin@gmail.com","78910",20);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
		System.out.println("***********************");
		
		UserManager userManager=new UserManager();
				
		User[] users= {student,instructor};
		userManager.addMultiple(users);

	}

}
