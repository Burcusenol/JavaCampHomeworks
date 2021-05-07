package Day5.business.abstracts;

import java.util.List;

import Day5.entities.concrete.User;

public interface UserService {
 void add(User user);
 User getByMail(String email);
 List<User> getAll();
 
}
