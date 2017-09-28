package runnDOne;

import java.util.List;

import DAO.LocationMasterDAO;
import DAOImplementation.LocationMasterImplementation;
import model.LocationMaster;


public class LocationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocationMaster locationMaster=new LocationMaster();
		locationMaster.setLocationMasterId(1234);
		locationMaster.setName("Mumbai");
		locationMaster.setCode("In");
		locationMaster.setCountry("India");
		locationMaster.setAirportName("dsdd");
		LocationMasterDAO locationMasterDAO =new LocationMasterImplementation();
		//locationMasterDAO.createLocation(locationMaster);
		//locationMasterDAO.updateLocation(locationMaster);
		//locationMasterDAO.deleteLocation(1234);
		
		LocationMaster temp=locationMasterDAO.getLocation(8005);
		System.out.println(temp.getAirportName()+temp.getCountry());
		
		List<LocationMaster> location=locationMasterDAO.getAllLocation();
		for(LocationMaster locationL:location)
		{
			System.out.println(locationL.getAirportName()+"\t"+locationL.getCountry());
		}
		
	}

}
