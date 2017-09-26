package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.PersonDAO;
import model.Person;
import utilities.SessionFactoryObject;

public class PersonImplementation implements PersonDAO {
	
	Session session=SessionFactoryObject.getSession();

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		
		
	}

	@Override
	public void modifyPersonDetails(Person person) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.update(person);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
	
		
	}

	@Override
	public boolean checkLogin(String userName, String password) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean checkUser(String emailAddress) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		String SQL_QUERY="SELECT COUNT(*) FROM Person where emailAddress='"+emailAddress+"'";
		Query query=session.createQuery(SQL_QUERY);
		
		
		return false;
	}

//	public List<Person> getPersonList() {
	//List <Person > personList=new ArrayList<>();
	//session.beginTransaction();
//	personList=session.createQuery("from Person").list();
	//session.getTransaction().commit();
	//session.flush();
	//session.close();
	//return personList;
	//}
	
	@Override
	public void deletePerson(String emailAddress) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		//Person per=(Person)session.load(Person.class,emailAddress);
		
		//session.delete(per);
		Query delete_query=session.createQuery("delete from Person where emailAddress=:id");
		delete_query.setParameter("id", emailAddress);
		int n=delete_query.executeUpdate();
		System.out.println(n);
		session.getTransaction().commit();
	}
	}
