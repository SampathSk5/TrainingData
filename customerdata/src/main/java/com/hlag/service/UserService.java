package com.hlag.service;

import java.util.List;
import java.util.Optional;

import com.hlag.customerdata.User;

public interface UserService {

	public User addUser(User user);

	public Optional<User> getUserById(String id);

	public Optional<List<User>> getUsers();

	public void deleteUser(String id);

	public User updateUser(String id, User user);
}
