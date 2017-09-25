package DAO;

import java.util.List;

import model.FareMaster;

public interface FareMasterDAO {
	
	public void newFare(FareMaster fareMaster);
	public void modifyFare(FareMaster fareMaster);
	public void deleteFare(int fareId);
	public FareMaster getFare(int fareMasterId);
	public List<FareMaster> getAllFareList();
}
