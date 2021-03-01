
package parkinglot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ParkingMain {
	public static void main(String[] args) {
		//private static final Logger log = LoggerFactory.getLogger(ParkingMain.class);
		ParkingService pservice = new ParkingService();
		ParkingLot pl = new ParkingLot(20, 20, 0, true);
		List<ParkingSpace> availablePSList = pservice.parkingSpacesCreation(pl);
		List<ParkingAssignInfo> parkingAssignList = new ArrayList<>();

		// Entrance //
		Vehicle v = new Vehicle("ABC89283", VehicleType.CAR);
		//for (Vehicle v1 : VehicleStaticData.getVehiclesList()) {
			
		if (pservice.parkingIsAvailable(pl) /* && availablePSList.size() > 0 */) {
				ParkingSpace ps = availablePSList.get(0);
				ParkingAssignInfo pai = pservice.parkingAssign(pl, v, ps);
				availablePSList.remove(0);
				parkingAssignList.add(pai);
				
			} else {
				System.out.println("Parking Lot is full");
			//}
	 }

		// Exit 
		String vehicleNo="ABC89283";
		ParkingAssignInfo painfo = pservice.getParkingAssignInfoByVehicleNo(parkingAssignList, vehicleNo);
		
		if (painfo != null) {
			parkingAssignList.remove(painfo);
			painfo = pservice.priceCalculation(painfo);
			painfo.setStatus("Exit");
			pl.setAllotedSpaces(pl.getAllotedSpaces() - 1);
			pl.setFreeSpaces(pl.getFreeSpaces() + 1);
			pl.setAvailabe(true);
			availablePSList.add(painfo.getParkingSpace());
			System.out.println(painfo.toString());
			
		}

		// Parking spaces to their vehicle no
		List<ParkingAssignInfo> paiAvailableList = pservice.getAvailebleParkingAssignInfo(parkingAssignList);
		for (ParkingAssignInfo pai1 : paiAvailableList) {
			System.out.println(pai1.toString());
			
		}
	}

}
