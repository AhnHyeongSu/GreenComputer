package sec05.exam04;

public class Singleton {
	private static Singleton singleton = new Singleton();	//private 는 외부에서는 볼 수 없고, 내부에서는 보인다.
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}
