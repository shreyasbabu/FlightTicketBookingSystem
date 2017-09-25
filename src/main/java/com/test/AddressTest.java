package runnDOne;

import java.util.List;

import DAO.AddressDetailsDAO;
import DAOImplementation.AddressDetailsImplementation;
import model.AddressDetail;

public class AddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressDetail addressDetail=new AddressDetail();
		addressDetail.setAddressId(1234);
		addressDetail.setLine1("Yoo");
		addressDetail.setLine2("second line DOne");
		addressDetail.setLine3("line 3");
		addressDetail.setType("office");
		addressDetail.setCountry("India");
		addressDetail.setPincode(400037);
		addressDetail.setCity("Mumbai");
		
		AddressDetailsDAO addressDetailsDAO=new AddressDetailsImplementation();
		//addressDetailsDAO.deleteAddress(1234);
		addressDetailsDAO.addNewAddress(addressDetail);
		addressDetail.setCity("Banglore");
		addressDetailsDAO.modifyAddress(addressDetail);
		/*List<AddressDetail> address=addressDetailsDAO.getAddressList();
		for(AddressDetail addressL:address)
		{
			System.out.println(addressL.getAddressId()+" "+addressL.getCountry());
		}*/
	}

}
