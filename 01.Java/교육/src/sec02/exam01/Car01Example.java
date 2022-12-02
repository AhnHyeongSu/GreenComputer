package sec02.exam01;

public class Car01Example {

	public static void main(String[] args) {
		Car01 myCar = new Car01();
		
		myCar.run();
		
		System.out.println("----------------");
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
