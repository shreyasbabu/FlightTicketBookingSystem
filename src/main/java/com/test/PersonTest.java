package runnDOne;

import DAO.PersonDAO;
import DAOImplementation.PersonImplementation;
import model.Person;

public class PersonTest {
    
	public static void main(String [] args){
		Person per = new Person();
		per.setPersonId(1002);
		per.setPassword("qwe");
		per.setEmailAddress("pqr@gmail.com");
	    per.setFirstName("sunil");
	    per.setMiddleName("singh");
	    per.setLastName("abc");
	    per.setGender("male");
	    per.setTitle("Mr.");
	    per.setDateOfBirth(null);
	    per.setPassportNumber("jkl12345");
		per.setMobileNumber(8652373976l);
	    PersonDAO personDAO=new PersonImplementation();
	   // personDAO.addPerson(per);
	    //personDAO.deletePerson("pqr@gmail.com");
	    
	    personDAO.modifyPersonDetails(per);
	  //  personDAO.checkLogin("sunil","abc");
	 //   personDAO.checkUser("abc@gmail.com");
	    
	  //List<Person> person=personDAO.getPersonList();
	    //for(Person personP:person){
	    	//System.out.println(personP.getEmailAddress()+""+personP.getPersonId());
	    	
	    //}
	    
	    
	    
	
		
		
	}
}
