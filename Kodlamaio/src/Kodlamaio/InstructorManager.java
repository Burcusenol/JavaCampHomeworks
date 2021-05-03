package Kodlamaio;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {

		super.add(user);
		System.out.println("The instructor " + user.getFirstName()+" "+ user.getLastName()+" added");
		
	}

	@Override
	public void update(User user) {
		super.update(user);
		System.out.println("The instructor" + user.getFirstName()+" "+ user.getLastName()+" updated");
		
	}

	@Override
	public void delete(User user) {
		super.delete(user);
		System.out.println("The instructor" + user.getFirstName()+" "+ user.getLastName()+" deleted");
		
	}

}
