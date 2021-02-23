package parkinglot;


public class ParkingLot {
	private long totalSpaces;
	private long freeSpaces;
	private long allotedSpaces;
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
	public long getTotalSpaces() {
		return totalSpaces;
	}
	public void setTotalSpaces(long totalSpaces) {
		this.totalSpaces = totalSpaces;
	}
	public long getFreeSpaces() {
		return freeSpaces;
	}
	public void setFreeSpaces(long freeSpaces) {
		this.freeSpaces = freeSpaces;
	}
	public long getAllotedSpaces() {
		return allotedSpaces;
	}
	public void setAllotedSpaces(long allotedSpaces) {
		this.allotedSpaces = allotedSpaces;
	}
	public boolean isAvailabe() {
		return availabe;
	}
	public void setAvailabe(boolean availabe) {
		this.availabe = availabe;
	}
}