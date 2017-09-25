package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import DAO.PassengerDAO;
import model.AddressDetail;
import model.Passenger;
import utilities.SessionFactoryObject;

public class PassengerImplementation implements PassengerDAO {
	
	Session session=SessionFactoryObject.getSession();

	@Override
	public void newPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(passenger);
		session.getTransaction().commit();

	}

	@Override
	public List<Passenger> getPassenger(int bookingId) {
		// TODO Auto-generated method stub
		List<Passenger> passg=new ArrayList<>();
		session.beginTransaction();
		passg=session.createQuery("from Passenger").list();
		session.getTransaction().commit();
		
		return passg;
	}

}
