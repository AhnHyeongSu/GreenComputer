package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();	//추상메소드는 객체생성이 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}

}
