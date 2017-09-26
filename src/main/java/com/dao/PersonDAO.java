package DAO;

import model.Person;

public interface PersonDAO {
	
	public void addPerson(Person person);
	public void modifyPersonDetails(Person person);
	public boolean checkLogin(String userName,String password);
	public boolean checkUser(String emailAddress);
	public void deletePerson(String emailAddress);

}
