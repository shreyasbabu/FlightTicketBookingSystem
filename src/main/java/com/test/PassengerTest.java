package runnDOne;

import java.util.List;

import DAO.PassengerDAO;
import DAOImplementation.PassengerImplementation;
import model.AddressDetail;
import model.Passenger;

public class PassengerTest {
	
	public static void main(String[] args) {
		
		Passenger passenger=new Passenger();
		passenger.setPassengerId(2);
		passenger.setPassengerType("adult");
		passenger.setFirstName("ash");
		passenger.setMiddleName("ley");
		passenger.setLastName("abc");
		passenger.setPassportNumber("PA12");
		passenger.setMealPreferences("NVG");
		//passenger.setBooking
		
		PassengerDAO p=new PassengerImplementation();
		
		p.newPassenger(passenger);
		
		List<Passenger> pas=p.getPassenger(300005);
		for(Passenger PL:pas)
		{
			System.out.println(PL.getPassengerId()+" "+PL.getFirstName());
		}
		
		
	}

}
