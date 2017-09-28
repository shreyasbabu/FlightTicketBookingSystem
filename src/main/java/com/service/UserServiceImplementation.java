package com.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jdbc.PersonImplementation;
import com.model.Person;

@Service
public class UserServiceImplementation {
	@Autowired
	private PersonImplementation person;
	public boolean checkLogin(String emailId, String password) {
		
		Person p = person.getUser(emailId);
		if (p != null) {
			String userPass = p.getPassword();
			if (userPass.equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean checkIfUserExists(String emailId) {
		PersonImplementation PersonImplementation = new PersonImplementation();
		Person p = PersonImplementation.getUser(emailId);
		if (p != null)
			return true;
		else
			return false;
	}

	public boolean verifyEmail(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<HashMap<String, String>> getHistory(int personId) {

		return null;
	}

	public boolean registerPerson(Person person) {
		PersonImplementation PersonImplementation = new PersonImplementation();
		return PersonImplementation.addPerson(person);

	}

	public boolean forgotPassword(String emailAddress, String newPassword) {
		
		Person p = person.getUser(emailAddress);
		if (p != null) {
			p.setPassword(newPassword);
			return person.modifyPersonDetails(p);
		} else
			return false;
	}

}