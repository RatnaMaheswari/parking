package parkinglot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ParkingService {
  
	public boolean parkingIsAvailable(ParkingLot p) {
	return parkingIsAvailable(p);
	  
  }
	public ParkingAssignInfo assignInfo(ParkingLot parkingLot,Vehicle vehicle,ParkingSpace parkingSpace) {
		parkingLot.setAllotedSpaces(parkingLot.getAllotedSpaces()+1);
		parkingLot.setFreeSpaces(parkingLot.getFreeSpaces()-1);
		if(parkingLot.getTotalSpaces()==parkingLot.getAllotedSpaces()) {
			parkingLot.setAvailabe(false);
		}
		ParkingAssignInfo info=new ParkingAssignInfo();
		info.setVehicle(vehicle);
		info.setParkingSpace(parkingSpace);
		info.setEntyTime(new Date());
		info.setStatus("Available");
		return info;
		
		}
	
	public List<ParkingSpace> parkingSpacesCreation(ParkingLot parkingLot){
		List<ParkingSpace> psList=new ArrayList<>();
		for(long i=1;i<parkingLot.getTotalSpaces();i++) {
			
			psList.add(new ParkingSpace(i, "A"));
		}
		return psList;
		
	}
	/*
	 * public ParkingAssignInfo
	 * getParkingAssignInfoByVehicleNo(List<ParkingAssignInfo> paiList, String
	 * vehicleNo) { ParkingAssignInfo pai= paiList.stream().filter(paiObj ->
	 * (vehicleNo.equals(paiObj.getVehicle().getVehicleNo()) &&
	 * "Available".equals(paiObj.getStatus()))).findAny().orElse(null); return pai;
	 * }
	 */
public ParkingAssignInfo getParkingInfoByVehicleNo(List<ParkingAssignInfo> paiList,String vehicleNo) {
}
}
}
