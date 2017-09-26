package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import DAO.FareMasterDAO;
import model.AddressDetail;
import model.FareMaster;

import org.hibernate.Query;
import org.hibernate.Session;

import utilities.SessionFactoryObject;

public class FareMasterImplementation implements FareMasterDAO {

	Session session = SessionFactoryObject.getSession();
	@Override
	public void newFare(FareMaster fareMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(fareMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
	}

	@Override
	public void modifyFare(FareMaster fareMaster) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.update(fareMaster);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
		
	}

	@Override
	public void deleteFare(int fareId) {
		// TODO Auto-generated method stub
		
		session.beginTransaction();
		FareMaster del = (FareMaster) session.load(FareMaster.class, fareId);
		//FareMaster del = new FareMaster(12);
		session.delete(del);
		
		/*Query delete_query=session.createQuery("delete from FareMaster where fareId=:id");
		delete_query.setParameter("id", fareId);
		int n=delete_query.executeUpdate();
		System.out.println(n);*/
		session.getTransaction().commit();
	
		
		
	}

	@Override
	public FareMaster getFare(int fareMasterId) {
		// TODO Auto-generated method stub
		FareMaster fareMaster = new FareMaster();
		session.beginTransaction();
		fareMaster = (FareMaster)session.get(FareMaster.class,fareMasterId );
		return fareMaster;
	}

	@Override
	public List<FareMaster> getAllFareList() {
		// TODO Auto-generated method stub
		List<FareMaster> fareMasterList = new ArrayList<>();
		session.beginTransaction();
		fareMasterList = session.createQuery("from FareMaster").list();
		session.getTransaction().commit();
		session.flush();
		session.close();
		return fareMasterList;
	}

}
