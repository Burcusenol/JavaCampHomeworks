package Day5.dataAccess.abstracts;

import java.util.List;

import Day5.entities.concrete.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByEmail(String email);
	List<User> getAll();
	User getByEmailandPassword(String email,String password);
}
