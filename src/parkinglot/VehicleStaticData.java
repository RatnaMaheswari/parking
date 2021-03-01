package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class VehicleStaticData {
	
		public static List<Vehicle> getVehiclesList(){
			List<Vehicle> vehicleList=new ArrayList<>();
			vehicleList.add(new Vehicle("ABC89283",VehicleType.CAR) );
			vehicleList.add(new Vehicle("YUI9033",VehicleType.TRUCK) );	
			vehicleList.add(new Vehicle("UIY9484",VehicleType.MOTORBIKE) );			
			vehicleList.add(new Vehicle("ABC8903",VehicleType.CAR) );	
			vehicleList.add(new Vehicle("ABC9090",VehicleType.TRUCK) );	
			vehicleList.add(new Vehicle("ABC1000",VehicleType.MOTORBIKE) );
			vehicleList.add(new Vehicle("ABC2000",VehicleType.CAR) );
			vehicleList.add(new Vehicle("YUI9033",VehicleType.TRUCK) );	
			vehicleList.add(new Vehicle("ABC4000",VehicleType.MOTORBIKE) );			
			vehicleList.add(new Vehicle("ABC50003",VehicleType.CAR) );
			vehicleList.add(new Vehicle("ABC60000",VehicleType.TRUCK) );
			vehicleList.add(new Vehicle("ABC70000",VehicleType.MOTORBIKE) );		
			vehicleList.add(new Vehicle("ABC80000",VehicleType.CAR) );
			vehicleList.add(new Vehicle("ABC90000",VehicleType.TRUCK) );
			vehicleList.add(new Vehicle("ABC10000",VehicleType.MOTORBIKE) );		
			vehicleList.add(new Vehicle("ABC90324",VehicleType.CAR) );
			vehicleList.add(new Vehicle("ABC30000",VehicleType.TRUCK) );
			
			return vehicleList;
		}
	}

