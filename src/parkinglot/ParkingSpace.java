package parkinglot;



public class ParkingSpace {
	private int id;
	private String blockName;
	public ParkingSpace(int id, String blockName) {
		super();
		this.id = id;
		this.blockName = blockName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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