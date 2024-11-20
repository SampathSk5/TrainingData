package com.hlag.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.hlag.customerdata.User;

public class UserRepositoryImpl implements UserRepository {

	private Set<User> users = new HashSet();

	private static UserRepositoryImpl instance;

	private UserRepositoryImpl() {
	}

	public static UserRepositoryImpl getInstance() {
		synchronized (UserRepositoryImpl.class) {
			if (instance == null) {
				instance = new UserRepositoryImpl();
			}
		}
		return instance;
	}

	@Override
	public User addUser(User user) {

		boolean result = users.add(user);
		if (result) {
		}
		return user;

	}

	@Override
	public Optional<User> getUserById(String id) {
		UUID uuid = UUID.fromString(id);
		return users.stream().filter(e -> e.getUserid().toString().equals(id)).findFirst();
	}

	@Override
	public Optional<List<User>> getUsers() {
		if (users.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(new ArrayList<>(users));
		}
	}

	@Override
	public void deleteUser(String id) {
		Optional<User> userOpt = getUserById(id);
		if (userOpt.isPresent()) {
			users.remove(userOpt.get());
			System.out.println("User with ID " + id + " deleted.");
		} else {
			System.out.println("User with ID " + id + " not found.");
		}
	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public User updateUser(String id, User updatedUser) {
	// Optional<User> existUset = getUserById(id);
	// if (existUset.isPresent()) {
	// User user = existUset.get();
	// int index = users.indexOf(user);
	// users.add(index, updatedUser);
	// return updatedUser;
	// }
	// return updatedUser;
	// }

}
