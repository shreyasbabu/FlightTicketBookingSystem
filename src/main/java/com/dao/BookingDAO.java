package DAO;

import java.util.List;
import model.Booking;

public interface BookingDAO {
	
	public void newBooking(Booking booking);
	public boolean checkAvailability(int flightId,int seatRequired);
	public List<Booking> getBookingHistory(int personId);

}