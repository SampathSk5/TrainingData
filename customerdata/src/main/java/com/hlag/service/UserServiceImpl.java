package com.hlag.service;

import java.util.List;
import java.util.Optional;

import com.hlag.customerdata.User;
import com.hlag.repository.UserRepository;
import com.hlag.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository = UserRepositoryImpl.getInstance();

	private static UserServiceImpl userService;

	public static UserServiceImpl getInstance() {
		if (userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}

	@Override
	public User addUser(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public Optional<User> getUserById(String id) {
		return userRepository.getUserById(id);
	}

	@Override
	public Optional<List<User>> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
