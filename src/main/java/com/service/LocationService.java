package com.service;

import java.util.List;

import com.model.LocationMaster;

public interface LocationService {
	public void createLocation(LocationMaster locationMaster);
	public void updateLocation(LocationMaster locationMaster);
	public void deleteLocation(int locationId);
	//public LocationMaster getLocation(int locationMasterId);
	//public List<LocationMaster> getAllLocation();
}
