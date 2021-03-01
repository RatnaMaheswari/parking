
package parkinglot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



public class ParkingService {
	public boolean parkingIsAvailable(ParkingLot pl) {
		return pl.isAvailabe();
	}

	public ParkingAssignInfo parkingAssign(ParkingLot pl, Vehicle v, ParkingSpace ps) //throws SpaceNotFoundException 
	{
		pl.setAllotedSpaces(pl.getAllotedSpaces() + 1);
		pl.setFreeSpaces(pl.getFreeSpaces() - 1);
		if (pl.getTotalSpaces() == pl.getAllotedSpaces()) {
			pl.setAvailabe(false);
			// exception
			//throw new SpaceNotFoundException(Constants.SPACE_NOT_FOUND );
			
		}
		ParkingAssignInfo pai = new ParkingAssignInfo();
		pai.setVehicle(v);
		pai.setParkingSpace(ps);

		LocalDateTime localDateTime = LocalDateTime.now();
		pai.setEntyTime(localDateTime);

		// pai.setEntyTime(new Date());
		pai.setStatus("Available");
		return pai;
	}

	public List<ParkingSpace> parkingSpacesCreation(ParkingLot pl) {
		List<ParkingSpace> psList = new ArrayList<>();
		for (int i = 1; i <= pl.getTotalSpaces(); i++) {
			psList.add(new ParkingSpace(i, "BLOCK A"));
		}
		return psList;
	}

	public ParkingAssignInfo getParkingAssignInfoByVehicleNo(List<ParkingAssignInfo> paiList, String vehicleNo) 
			//throws VehicleNotFoundException   
	{
		
		ParkingAssignInfo pai = paiList.stream().filter(paiObj -> (vehicleNo.equals(paiObj.getVehicle().getVehicleNo())
				&& "Available".equals(paiObj.getStatus()))).findAny().orElse(null);
		
		return pai;

		
		
	}

	public List<ParkingAssignInfo> getAvailebleParkingAssignInfo(List<ParkingAssignInfo> paiList)  {
		List<ParkingAssignInfo> paiList1 = paiList.stream().filter(paiObj -> "Available".equals(paiObj.getStatus()))
				.collect(Collectors.toList());
		return paiList1;
	}

	public ParkingAssignInfo priceCalculation(ParkingAssignInfo pai) {
		// pai.setExitTime(new Date());

		LocalDateTime localDateTimeexit = LocalDateTime.now();
		pai.setExitTime(localDateTimeexit);
		long time = (pai.getEntyTime().getHour() - pai.getExitTime().getHour());

		if (time < 4) {

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

	
}
