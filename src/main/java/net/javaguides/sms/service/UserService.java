package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.User;

public interface UserService {
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(Long id);
	
	User updateUser(User user);
	
	void deleteUserById(Long id);
}
