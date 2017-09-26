package service;

import java.util.List;

public interface UserService {
	//user
	public boolean checkLogin();
	//register
	public boolean checkIfUserExists(String emailId);
	public boolean verifyEmail(String emailId);
	//person
	public List getHistory(int personId);
	public void cancelBooking(int bookingId);
	

}
