package parkinglot;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import parking.ParkingAssignInfo;
import parking.ParkingService;
import parking.ParkingSpace;
import parking.Vehicle1;




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
   public ParkingAssignInfo getParkingInfoByVehicleNo(List<ParkingAssignInfo> paiList,String vehicleNo) {
	ParkingAssignInfo pai=paiList.stream().filter(paiObj->(vehicleNo.equals(paiObj.getVehicle().getVehicleNo())
			&&"Available".equals(paiObj.getStatus()))).findAny().orElse(null);

	 return pai;
  }
   public List<ParkingAssignInfo> getAvailebleParkingAssignInfo(List<ParkingAssignInfo> paiList) {
		List<ParkingAssignInfo> paiList1 = paiList.stream().filter(paiObj -> "Available".equals(paiObj.getStatus()))
				.collect(Collectors.toList());
		return paiList1;
	}
   public ParkingAssignInfo priceCalculation(ParkingAssignInfo pai) {
		pai.setExitTime(new Date());
		long time = (pai.getEntyTime().getTime() - pai.getExitTime().getTime() / (1000 * 60 * 60)) % 24;
		if (time > 4) {
			pai.setPrice(20d);
		} else if (time > 12) {
			pai.setPrice(50d);
		} else if (time > 24) {
			pai.setPrice(100d);
		} else {
			pai.setPrice(300d);
		}
		return pai;
	}
   public static void main(String[] args) {
		System.out.println("hi Rathna");
		ParkingService ps = new ParkingService();
		List<ParkingAssignInfo> paiList = new ArrayList<>();
		paiList.add(new ParkingAssignInfo(new ParkingSpace(1, "BLOCK A"), new Vehicle("ABC1562", "CAR"), new Date(),
				new Date(), "Available", 1d));
		paiList.add(new ParkingAssignInfo(new ParkingSpace(1, "BLOCK A"), new Vehicle("ABC7935", "CAR"), new Date(),
				new Date(), "Available", 0d));
		paiList.add(new ParkingAssignInfo(new ParkingSpace(1, "BLOCK A"), new Vehicle("ABC0398", "CAR"), new Date(),
				new Date(), "Exit", 0d));
		paiList.add(new ParkingAssignInfo(new ParkingSpace(1, "BLOCK A"), new Vehicle("ABC9028", "CAR"), new Date(),
				new Date(), "Available", 0d));
		paiList.add(new ParkingAssignInfo(new ParkingSpace(1, "BLOCK A"), new Vehicle("ABC0001", "CAR"), new Date(),
				new Date(), "Available", 40d));
		ParkingAssignInfo pai=ps.getParkingInfoByVehicleNo(paiList, "ABC0001");
		System.out.println("ParkingAssignInfo :" + pai.toString());
		List<ParkingAssignInfo> paiList1 = ps.getAvailebleParkingAssignInfo(paiList);
		for (ParkingAssignInfo pai1 : paiList1) {
			System.out.println("Filter :" + pai1.toString());
		}
	}
}


