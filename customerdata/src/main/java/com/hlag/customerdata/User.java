package com.hlag.customerdata;

import java.util.UUID;
import java.util.regex.Pattern;

import com.hlag.exception.InvalidNameException;

public class User {

	public UUID userid;
	public String firstname;
	public String lastname;
	public long mobilenumber;
	public String password;
	public String email;

	public void setFirstname(String firstname) throws InvalidNameException {
		if (firstname.length() > 2) {
			this.firstname = firstname;
		} else {
			throw new InvalidNameException("First name must be more than 2 characters.");
		}
	}

	public User(String firstname, String lastname, long mobilenumber, String password, String email) {

		this.userid = UUID.randomUUID();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.email = email;
	}

	public void setLastname(String lastname) {
		if (lastname.length() > 2) {
			this.lastname = lastname;
		} else {
			throw new IllegalArgumentException("Last name must be more than 2 characters.");
		}
	}

	public void setMobilenumber(long mobilenumber) {
		if (String.valueOf(mobilenumber).length() == 10) {
			this.mobilenumber = mobilenumber;
		} else {
			System.out.println("Mobile number must be exactly 10 digits.");
		}
	}

	public void setPassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		Pattern pattern = Pattern.compile(passwordRegex);

		if (pattern.matcher(password).matches()) {
			this.password = password;
		} else {
			throw new IllegalArgumentException("Invalid password");
		}
	}

	public void setEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(emailRegex);

		if (pattern.matcher(email).matches()) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("Invalid email");
		}
	}

	public UUID getUserid() {
		return userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + ", password=" + password + ", email=" + email + "]";
	}

}
