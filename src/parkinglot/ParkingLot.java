package parkinglot;

public class ParkingLot {
	
	private int totalSpaces;
	private int freeSpaces;
	private int allotedSpaces;
	private boolean availabe;
	public ParkingLot() {
		super();
	}
	public ParkingLot(int totalSpaces, int freeSpaces, int allotedSpaces, boolean availabe) {
		super();
		this.totalSpaces = totalSpaces;
		this.freeSpaces = freeSpaces;
		this.allotedSpaces = allotedSpaces;
		this.availabe = availabe;
	}
	public int getTotalSpaces() {
		return totalSpaces;
	}
	public void setTotalSpaces(int totalSpaces) {
		this.totalSpaces = totalSpaces;
	}
	public int getFreeSpaces() {
		return freeSpaces;
	}
	public void setFreeSpaces(int freeSpaces) {
		this.freeSpaces = freeSpaces;
	}
	public int getAllotedSpaces() {
		return allotedSpaces;
	}
	public void setAllotedSpaces(int allotedSpaces) {
		this.allotedSpaces = allotedSpaces;
	}
	public boolean isAvailabe() {
		return availabe;
	}
	public void setAvailabe(boolean availabe) {
		this.availabe = availabe;
	}
}