
public class ParkingSpot {
	private final VehicleSize size;
	private Vehicle currentVehicle;
	
	ParkingSpot(VehicleSize size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		currentVehicle = null;
	}
	
	boolean fit(Vehicle v) {
		return currentVehicle == null && size.getSize() >= v.getSize().getSize();
	}
	
	void park(Vehicle v) {
		currentVehicle = v;
	}
	
	void leave() {
		currentVehicle = null;
	}
	
	Vehicle getVehicle() {
		return currentVehicle;
	}
}
