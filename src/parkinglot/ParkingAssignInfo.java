package parkinglot;


import java.time.LocalTime;
import java.util.Date;

public class ParkingAssignInfo {
	private ParkingSpace parkingSpace;
	private Vehicle vehicle;
	private LocalTime entyTime;
	private LocalTime exitTime;
	private String status;
	private Double price;
	
	public ParkingAssignInfo(ParkingSpace parkingSpace, Vehicle vehicle, LocalTime entyTime, LocalTime exitTime,
			String status, Double price) {
		super();
		this.parkingSpace = parkingSpace;
		this.vehicle = vehicle;
		this.entyTime = entyTime;
		this.exitTime = exitTime;
		this.status = status;
		this.price = price;
	}
	public ParkingAssignInfo() {
		super();
		
	}
	
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}
	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public LocalTime getEntyTime() {
		return entyTime;
	}
	public void setEntyTime(LocalTime entyTime) {
		this.entyTime = entyTime;
	}
	public LocalTime getExitTime() {
		return exitTime;
	}
	public void setExitTime(LocalTime exitTime) {
		this.exitTime = exitTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ParkingAssignInfo [parkingSpace=" + parkingSpace + ", vehicle=" + vehicle + ", entyTime=" + entyTime
				+ ", exitTime=" + exitTime + ", status=" + status + ", price=" + price + "]";
	}
}
