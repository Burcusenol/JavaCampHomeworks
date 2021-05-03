package Kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" added.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" updated.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName()+" listed.");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	
}
