package DAO;
import model.*;

import java.util.List;
public interface AddressDetailsDAO {
	
	public void modifyAddress(AddressDetail addressDetail);
	public void addNewAddress(AddressDetail addressDetail);
	public List<AddressDetail> getAddressList();
	public void deleteAddress(int addressId);

}
