package parkinglot;

import java.util.ArrayList;
import java.util.List;


public class VehicleData {

	public static List<Vehicle> getVehicleList(){
		List<Vehicle> vehicleList=new ArrayList<>();
		
		
		vehicleList.add(new Vehicle("ABC89283","CAR"));
		vehicleList.add(new Vehicle("YUI9033","BIKE"));
		vehicleList.add(new Vehicle("UIY9484","VAN"));
		vehicleList.add(new Vehicle("ABC8903","CAR"));
		vehicleList.add(new Vehicle("ABC9090","CAR"));
		vehicleList.add(new Vehicle("ABC1000","BUS"));
		vehicleList.add(new Vehicle("ABC2000","TRUCK"));
		vehicleList.add(new Vehicle("ABC3000","CAR"));
		vehicleList.add(new Vehicle("ABC4000","BUS"));
		vehicleList.add(new Vehicle("ABC50003","CAR"));
		vehicleList.add(new Vehicle("ABC60000","TRUCK"));
		vehicleList.add(new Vehicle("ABC70000","BUS"));
		vehicleList.add(new Vehicle("ABC80000","CAR"));
		vehicleList.add(new Vehicle("ABC90000","VAN"));
		vehicleList.add(new Vehicle("ABC10000","CAR"));
		vehicleList.add(new Vehicle("ABC90324","TRUCK"));
		vehicleList.add(new Vehicle("P7633","VAN"));
		return vehicleList;
		
		
		
		
	}
}
