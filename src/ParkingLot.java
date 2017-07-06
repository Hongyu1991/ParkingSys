
public class ParkingLot {
	private final Level[] levels;
	public ParkingLot(int numLevels, int numSlotsPerLevel) {
		levels = new Level[numLevels];
		for (int i = 0; i < levels.length; i++) {
			levels[i] = new Level(numSlotsPerLevel);
		}
	}
	
	public boolean hasSpot(Vehicle v) {
		//System.out.println(levels.length);
		for (Level l : levels) {
			if (l.hasSpot(v)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean park(Vehicle v) {
		for (Level l : levels) {
			if (l.park(v)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean leave(Vehicle v) {
		for (Level l : levels) {
			if (l.leave(v)) {
				return true;
			}
		}
		return false;
	}

}
