package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.LocationMasterDAO;
import model.LocationMaster;
import utilities.SessionFactoryObject;

public class LocationMasterImplementation implements LocationMasterDAO {
	Session session=SessionFactoryObject.getSession();
	@Override
	public void createLocation(LocationMaster locationMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(locationMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
	}

	@Override
	public void updateLocation(LocationMaster locationMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.update(locationMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
	}

	@Override
	public void deleteLocation(int locationId) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		
		Query delete_query=session.createQuery("delete from LocationMaster where locationMasterId=:id");
		delete_query.setParameter("id", locationId);
		int n=delete_query.executeUpdate();
		System.out.println(n);
		session.getTransaction().commit();
		
		
	}

	@Override
	public LocationMaster getLocation(int locationMasterId) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		LocationMaster locationMaster=new LocationMaster();
		locationMaster=(LocationMaster)session.get(LocationMaster.class, locationMasterId);
		session.getTransaction().commit();
	
		return locationMaster;
	}

	@Override
	public List<LocationMaster> getAllLocation() {
		// TODO Auto-generated method stub
		List<LocationMaster> locationMasters=new ArrayList<>();
		session.beginTransaction();
		locationMasters=session.createQuery("from LocationMaster").list();
		session.getTransaction().commit();
		return locationMasters;
	}


}
