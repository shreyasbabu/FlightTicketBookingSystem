package DAOImplementation;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import DAO.FlightMasterDAO;
import model.AddressDetail;
import model.FlightMaster;

import org.hibernate.Session;

import utilities.SessionFactoryObject;

public class FlightMasterImplementation implements FlightMasterDAO {
	
	Session session=SessionFactoryObject.getSession();

	@Override
	public void newFlight(FlightMaster flightMaster) {
		session.beginTransaction();
		session.save(flightMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
	}

	@Override
	public List<FlightMaster> searchFlight(int sourceLocation, int destinationLocation, Date travelDate) {
		List<FlightMaster> FlightMasterList=new ArrayList<>();
		session.beginTransaction();
		FlightMasterList=session.createQuery("from FlightMaster").list();
		session.getTransaction().commit();
		session.flush();
		session.close();
		return null;
	}

	@Override
	public boolean updateRemainingSeats(int flightId, int seatBooked, String seatType) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
