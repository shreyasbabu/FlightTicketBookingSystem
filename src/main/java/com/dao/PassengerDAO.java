package DAO;

import java.util.List;
import model.Passenger;


public interface PassengerDAO {
		
	public void newPassenger(Passenger passenger);
	public List<Passenger> getPassenger(int bookingId);

}
