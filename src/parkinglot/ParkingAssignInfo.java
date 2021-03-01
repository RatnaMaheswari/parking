package parkinglot;

import java.time.LocalDateTime;
import java.util.Date;

public class ParkingAssignInfo {
	private ParkingSpace parkingSpace;
	private Vehicle vehicle;
    private LocalDateTime entyTime;
	private LocalDateTime exitTime;
    private String status;
	private Double price;

	public ParkingAssignInfo(ParkingSpace parkingSpace, Vehicle vehicle, LocalDateTime entyTime, LocalDateTime exitTime,
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

	public LocalDateTime getEntyTime() {
		return entyTime;
	}

	public void setEntyTime(LocalDateTime entyTime) {
		this.entyTime = entyTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public String getStatus() {
		return status;
	}
	/*
	 * public Date getEntyTime() { return entyTime; }
	 * 
	 * public void setEntyTime(Date entyTime) { this.entyTime = entyTime; }
	 * 
	 * public Date getExitTime() { return exitTime; }
	 * 
	 * public void setExitTime(Date exitTime) { this.exitTime = exitTime; }
	 */

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
