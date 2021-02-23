package parkinglot;


public class Vehicle {
	private String vehicleNo;
	private String type;
	public Vehicle(String vehicleNo, String type) {
		super();
		this.vehicleNo = vehicleNo;
		this.type = type;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", type=" + type + "]";
	}
}