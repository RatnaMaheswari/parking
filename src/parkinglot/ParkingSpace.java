package parkinglot;



public class ParkingSpace {
	private long id;
	private String blockName;
	public ParkingSpace(long i, String blockName) {
		super();
		this.id = i;
		this.blockName = blockName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	@Override
	public String toString() {
		return "ParkingSpace [id=" + id + ", blockName=" + blockName + "]";
	}
}