package DAOImplementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import DAO.AddressDetailsDAO;
import model.AddressDetail;
import utilities.SessionFactoryObject;

public class AddressDetailsImplementation implements AddressDetailsDAO {

	Session session=SessionFactoryObject.getSession();
	
	@Override
	public void modifyAddress(AddressDetail addressDetail) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.update(addressDetail);
		session.getTransaction().commit();
	}
	
	@Override
	public void addNewAddress(AddressDetail addressDetail) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(addressDetail);
		session.getTransaction().commit();
	}
	
	@Override
	public List<AddressDetail> getAddressList() {
		// TODO Auto-generated method stub
		List<AddressDetail> addressDetailList=new ArrayList<>();
		session.beginTransaction();
		addressDetailList=session.createQuery("from AddressDetail").list();
		session.getTransaction().commit();
		return addressDetailList;
		
	}
	
	@Override
	public void deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Query delete_query=session.createQuery("delete from AddressDetail where addressId=:id");
		delete_query.setParameter("id", addressId);
		int n=delete_query.executeUpdate();
		session.getTransaction().commit();
	}
	
}	