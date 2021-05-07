package Day5.business.concrete;



import java.util.List;


import Day5.business.abstracts.UserService;
import Day5.core.abstracts.GoogleEmailService;
import Day5.dataAccess.abstracts.UserDao;
import Day5.entities.concrete.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleEmailService googleEmailService;
	

	
	public UserManager(UserDao userDao,GoogleEmailService googleEmailService) {
		super();
		this.userDao = userDao;
		this.googleEmailService=googleEmailService;
	}

	@Override
	public void add(User user) {
		
		 var result= checkIfUserValidate(user);
		
		if(result!=false) {
			userDao.add(user);
		
		googleEmailService.send(user.getEmail(), "Added");
		}
		else {
			System.out.println("Try again");
		}
		
		
		
		
		
		
	}

	@Override
	public User getByMail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		for(User user:userDao.getAll()) {
			System.out.println(user.getFirstName()+" " +user.getLastName());
		}
		return userDao.getAll();
	}
	
	public boolean checkIfUserValidate(User user)
	{
		if(user.getFirstName().length()>=2&&user.getLastName().length()>=2) {
			
			return true;
		}
		System.out.println("First name anda last name must be equal or grater than 2");
		return false;
	
	}
	
	
	

}
