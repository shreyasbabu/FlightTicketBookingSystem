package DAO;

import java.util.List;

import model.LocationMaster;

public interface LocationMasterDAO {
	
	public void createLocation(LocationMaster locationMaster);
	public void updateLocation(LocationMaster locationMaster);
	public void deleteLocation(int locationId);
	public LocationMaster getLocation(int locationMasterId);
	public List<LocationMaster> getAllLocation();
	
}
