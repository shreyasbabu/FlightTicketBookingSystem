package main.java.com.dao.daoImplementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.FleetMasterDAO;
import model.FleetMaster;
import utilities.SessionFactoryObject;

public class FleetMasterImplementation implements FleetMasterDAO{
	Session session=SessionFactoryObject.getSession();
	
	@Override
	public void createFleet(FleetMaster fleetMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(fleetMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
	}

	@Override
	public void modifyFleet(FleetMaster fleetMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.update(fleetMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
	}

	@Override
	public void deleteFleet(int fleetId) {

		session.beginTransaction();
		Query delete_query=session.createQuery("delete from FleetMaster where fleetMasterId=:id");
		delete_query.setParameter("id", fleetId);
		int n=delete_query.executeUpdate();
		System.out.println(n);
		session.getTransaction().commit();
		
	}

	@Override
	public FleetMaster getFleet(int fleetId) {
		// TODO Auto-generated method stub
		FleetMaster fleetMaster = new FleetMaster();
		session.beginTransaction();
		fleetMaster = (FleetMaster)session.get(FleetMaster.class, fleetId);
		session.getTransaction().commit();
		session.flush();
		session.close();
		return fleetMaster;
	}

	@Override
	public List<FleetMaster> getAllFleet() {
		// TODO Auto-generated method stub
		List<FleetMaster> fleetMasterList = new ArrayList<>();
		session.beginTransaction();
		fleetMasterList = session.createQuery("from FleetMaster").list();
		session.getTransaction().commit();
		session.flush();
		session.close();
		return fleetMasterList;
	}

}
