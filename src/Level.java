import java.util.*;

public class Level {
	private final List<ParkingSpot> spots;
	
	public Level(int num) {
		List<ParkingSpot> list = new ArrayList<>(num);
		int i = 0;
		for (; i < num / 2; i++) {
			list.add(new ParkingSpot(VehicleSize.Compact));
		}
		for (; i < num; i++) {
			list.add(new ParkingSpot(VehicleSize.Large));
		}
		spots = Collections.unmodifiableList(list);
	}
	
	boolean hasSpot(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				return true;
			}
		}
		return false;
	}
	
	boolean park(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				s.park(v);
				return true;
			}
		}
		return false;
	}
	
	boolean leave(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.getVehicle() == v) {
				s.leave();
				return true;
			}
		}
		return false;
	}
	

}
