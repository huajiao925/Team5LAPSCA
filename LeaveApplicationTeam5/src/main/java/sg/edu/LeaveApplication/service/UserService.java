package sg.edu.LeaveApplication.service;

import java.util.ArrayList;

import sg.edu.LeaveApplication.model.User;

public interface UserService {
public ArrayList<User> findAll();
	
	public boolean saveUser (User user);
	public boolean editUser (User user);
	public void deleteUser (User user);
	public ArrayList<String> findAllUserNames(String name);
	
	public User findUserById(Integer id);
}
