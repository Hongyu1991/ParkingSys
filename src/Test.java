import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
//		fail("Not yet implemented");
		ParkingLot lot = new ParkingLot(4, 60);
		Car c = new Car();
//		assert 1 == 1;//lot.park(c);
		assert lot.hasSpot(c);
	}

}
