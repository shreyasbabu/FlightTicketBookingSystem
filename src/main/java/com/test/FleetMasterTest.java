package main.java.com.test;

import java.util.List;

import DAO.FleetMasterDAO;
import DAOImplementation.FleetMasterImplementation;
import model.FleetMaster;

public class FleetMasterTest {
	
	public static void main(String[] args) {
		
	FleetMaster fleetMaster = new FleetMaster();
	fleetMaster.setFleetMasterId(4);
	fleetMaster.setCode("A1004");
	fleetMaster.setModel("Z1004");
	fleetMaster.setTotalBusinessSeats(80);
	fleetMaster.setTotalPremiumSeats(100);
	fleetMaster.setTotalEconomySeats(70);
	
	FleetMasterDAO fleetMasterDAO = new FleetMasterImplementation();
//	fleetMasterDAO.createFleet(fleetMaster);
	
//	fleetMaster.setTotalBusinessSeats(70);
//	fleetMasterDAO.modifyFleet(fleetMaster);
//	
//	System.out.println(fleetMasterDAO.getFleet(4));
	
//	List <FleetMaster> fleetMaster1 = fleetMasterDAO.getAllFleet();
//	for(FleetMaster fm : fleetMaster1 ){
//		System.out.println(fm.getModel()+" "+fm.getCode());
//	}
	
	fleetMasterDAO.deleteFleet(4);
	}
}