package Day5.business.abstracts;

import Day5.entities.concrete.User;
import Day5.entities.concrete.UserDto;

public interface AuthService {
 void register(User user);
 void login(UserDto userDto);
 boolean userExist(String email);
}
