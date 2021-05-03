package Kodlamaio;

public class StudentManager  extends UserManager{

	@Override
	public void add(User user) {
		
		super.add(user);
		System.out.println("The student " + user.getFirstName() +" " + user.getLastName()+" added.");
	}

	@Override
	public void update(User user) {
		System.out.println("The student" + user.getFirstName()+ " "+ user.getLastName()+" updated.");
		super.update(user);
	}
	
	
	

	@Override
	public void delete(User user) {
		System.out.println("The student " + user.getFirstName() +" "+ user.getLastName()+" deleted.");
		super.delete(user);
	}

	

}
