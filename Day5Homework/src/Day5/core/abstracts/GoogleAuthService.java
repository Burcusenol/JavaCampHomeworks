package Day5.core.abstracts;

import Day5.entities.concrete.UserDto;

public interface GoogleAuthService {
 void register(String email);
 void login(UserDto userDto);
 void userExists(String email);
}
