package DAO;

import java.util.List;

import model.FleetMaster;

public interface FleetMasterDAO {
	
	public void createFleet(FleetMaster fleetMaster);
	public void modifyFleet(FleetMaster fleetMaster);
	public void deleteFleet(int fleetId);
	public FleetMaster getFleet(int fleetId);
	public List<FleetMaster> getAllFleet();
}
