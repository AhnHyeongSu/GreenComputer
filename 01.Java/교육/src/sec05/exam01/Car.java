package sec05.exam01;

public class Car {
	//필드
	String model1;
	int speed;
	
	//생성자
	Car(String model1) {
		this.model1 = model1;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model1 + "가 달립니다.(시속: " + this.speed + "km/h)");
		}
	}
	

}
