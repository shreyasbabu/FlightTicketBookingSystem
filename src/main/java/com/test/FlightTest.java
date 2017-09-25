package runnDOne;

import java.sql.Time;

import DAO.FareMasterDAO;
import DAO.FlightMasterDAO;
import DAOImplementation.FareMasterImplementation;
import DAOImplementation.FlightMasterImplementation;
import model.FareMaster;
import model.FlightMaster;

public class FlightTest {
	public static void main(String[] args){
		
		
		FlightMaster flightMaster = new FlightMaster();
		flightMaster.setFlightId(1234);
		String time = "15:30:18";
		System.out.println();
		FareMasterDAO fareMasterDAO=new FareMasterImplementation();
		FareMaster fareMaster=fareMasterDAO.getFare(20001);
		
		flightMaster.setLocationMaster1(null);
		flightMaster.setLocationMaster2(null);
		flightMaster.setArrivalTime(Time.valueOf(time));
		flightMaster.setDepartureTime(Time.valueOf(time));
		flightMaster.setRemainingBusinessSeats(12);
		flightMaster.setRemainingEconomySeats(15);
		flightMaster.setRemainingPremiumSeats(10);
		flightMaster.setFareMaster(fareMaster);
		flightMaster.setFleetMaster(fleetMaster);
		
		FlightMasterDAO flightMasterDAO = new FlightMasterImplementation();
		flightMasterDAO.newFlight(flightMaster);
		/*List<FlightMaster> flight=flightMasterDAO.getFlightMasterList();
		for(FlightMaster flightL:flight)
		{
			System.out.println(flightL.getLocationMaster1()+" "+flightL.getLocationMaster2());
		}*/
		
	}
}