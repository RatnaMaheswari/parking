package parkinglot;

import java.util.ArrayList;
import java.util.List;



public class ParkingMain1 {
 
	 public static void main(String[] args) {
			ParkingService pservice = new ParkingService();
			ParkingLot pl = new ParkingLot(1000, 1000, 0, true);
			List<ParkingSpace> availablePSList = pservice.parkingSpacesCreation(pl);
			List<ParkingAssignInfo> paiList = new ArrayList<>();

			// Entrance //
			Vehicle v = new Vehicle("P7633", "CAR");
			for(Vehicle v1 :VehicleData.getVehicleList())
			 {
				if (pservice.parkingIsAvailable(pl) && availablePSList.size() > 0) {
					ParkingSpace ps = availablePSList.get(0);
					ParkingAssignInfo pai=pservice.assignInfo(pl, v1, ps);
					
					availablePSList.remove(0);
					paiList.add(pai);
				} else {
					System.out.println("Parking Lot is full");
				}
			}

			// Exit 
			String vehicleNo="P7633";
			ParkingAssignInfo painfo = pservice.getParkingInfoByVehicleNo(paiList, vehicleNo);
			if (painfo != null) {
				paiList.remove(painfo);
				painfo = pservice.priceCalculation(painfo);
				painfo.setStatus("Exit");
				pl.setAllotedSpaces(pl.getAllotedSpaces() - 1);
				pl.setFreeSpaces(pl.getFreeSpaces() + 1);
				pl.setAvailabe(true);
				availablePSList.add(painfo.getParkingSpace());
				System.out.println(painfo.toString());
			}

			// Parking spaces to their vehicle no
			List<ParkingAssignInfo> paiAvailableList = pservice.getAvailebleParkingAssignInfo(paiList);
			for (ParkingAssignInfo pai1 : paiAvailableList) {
				System.out.println(pai1.toString());
			}
		

 }
 
}
