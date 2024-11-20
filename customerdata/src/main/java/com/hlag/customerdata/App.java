package com.hlag.customerdata;

import java.util.List;
import java.util.Optional;

import com.hlag.service.UserService;
import com.hlag.service.UserServiceImpl;

public class App {

	public static void main(String[] args) {

		UserService userService = UserServiceImpl.getInstance();
		User user = null;
		switch ("OPERATION") {
			case "CREATE":

				user = new User("sam", "path", 9677805937L, "sam55", "samsk@example.com");
				userService.addUser(user);
				if (user != null) {
					System.out.println("User created successfully ");
				}
			case "RETRIVE_BY_ID":
				Optional<User> user2 = userService.getUserById(user.getUserid().toString());
			case "RETRIVE_ALL":
				Optional<List<User>> user3 = userService.getUsers();
				System.out.println("User list " + user3);
			case "UPDATE":
				User user4 = userService.updateUser(
						user.getUserid().toString(),
						user = new User("sam", "path", 9677805937L, "sam55", "samsk@example.com"));
				System.out.println("Updated User --- " + user4);
			case "DELETE":
				userService.deleteUser(user.getUserid().toString());
			default:
				break;
		}

	}
}