package sec01.exam04;

public class SupersonicAirplaneExample {
	public static void main(String[] atgs) {
	SupersonicAirplane sa = new SupersonicAirplane();
	sa.takeOff();
	sa.fly();
	sa.flyMode = SupersonicAirplane.SUPERSONIC;
	sa.fly();
	sa.flyMode = SupersonicAirplane.NOMAL;
	sa.fly();
	sa.land();
	}
}
