package Day5;

import Day5.business.concrete.AuthManager;
import Day5.business.concrete.UserManager;
import Day5.core.adapters.GoogleMailServiceAdapter;
import Day5.dataAccess.concrete.HibernateUserDao;
import Day5.entities.concrete.User;
import Day5.entities.concrete.UserDto;



public class Main {

	public static void main(String[] args) {
		
		User user=new User(3,"Ahmet","Ay","aliay@gmail.com","321654987",true);
		
		//User user1=new User(5,"A","Ay","aliay@gmail.com","32",true);
		
		UserManager userManager=new UserManager(new HibernateUserDao(),  new GoogleMailServiceAdapter());
			
		userManager.add(user);
		
		//userManager.add(user1);
		
		AuthManager authManager=new AuthManager(new UserManager(new HibernateUserDao(), new GoogleMailServiceAdapter()));
		
		userManager.getAll();
		
		//authManager.register(user1);
		
		
		UserDto userDto=new UserDto();
		userDto.setEmail("aliay@gmail.com");
		userDto.setPassword("123456");
		
		authManager.login(userDto);
		
		
		UserDto userDto1=new UserDto();
		userDto.setEmail("Abs");
		userDto.setPassword("123456");
		
		authManager.login(userDto1);
	
	}
	
}
			

	


