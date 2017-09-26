package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dao.LocationMasterDAO;
import com.model.LocationMaster;

@Service("locationService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LocationServiceImplementation implements LocationService {
	
	@Autowired
	private LocationMasterDAO locationDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void createLocation(LocationMaster locationMaster) {
		// TODO Auto-generated method stub
		locationDao.createLocation(locationMaster);
	}

	@Override
	public void updateLocation(LocationMaster locationMaster) {
		// TODO Auto-generated method stub
		locationDao.updateLocation(locationMaster);
	}

	@Override
	public void deleteLocation(int locationId) {
		// TODO Auto-generated method stub
		locationDao.deleteLocation(locationId);
	}

	/*@Override
	public LocationMaster getLocation(int locationMasterId) {
		// TODO Auto-generated method stub
		return locationDao.getLocation(locationMasterId);
	}*/

}
