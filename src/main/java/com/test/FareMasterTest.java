package runnDOne;

import model.FareMaster;

import java.util.ArrayList;
import java.util.List;

import DAO.AddressDetailsDAO;
import DAO.FareMasterDAO;
import DAOImplementation.AddressDetailsImplementation;
import DAOImplementation.FareMasterImplementation;



public class FareMasterTest {

	public static void main(String[] args) {
	
		FareMaster fareMaster = new FareMaster();
		fareMaster.setFareMasterId(12);
		fareMaster.setEconomyClass(100);
		fareMaster.setBusinessClass(300);
		fareMaster.setPremiumClass(500);
		
		FareMasterDAO fareMasterDAO=new FareMasterImplementation();
		fareMasterDAO.deleteFare(12);
		//fareMasterDAO.newFare(fareMaster);
		//fareMasterDAO.modifyFare(fareMaster);
		/*List<FareMaster> fareMasterList = fareMasterDAO.getAllFareList();
		for(FareMaster fare:fareMasterList)
		{
			System.out.println(fare.getBusinessClass()+" "+fare.getEconomyClass()+" "+fare.getFareMasterId()+" "+fare.getPremiumClass());
		} 
		
		System.out.println(fareMasterDAO.getFare(1234));	*/
		}
	
	
}
