package DAO;

import java.util.List;

import model.FlightMaster;

public interface FlightMasterDAO {
	
	public void newFlight(FlightMaster flightMaster);
	public List<FlightMaster> searchFlight(int sourceLocation,int destinationLocation,java.sql.Date travelDate);
	public boolean updateRemainingSeats(int flightId,int seatBooked,String seatType);

}
