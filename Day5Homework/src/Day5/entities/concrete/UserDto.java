package Day5.entities.concrete;

import Day5.entities.abstracts.Dto;

public class UserDto implements Dto{
 private String email;
 private String password;
public UserDto(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
 
 public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public UserDto() {
	// TODO Auto-generated constructor stub
}
}
