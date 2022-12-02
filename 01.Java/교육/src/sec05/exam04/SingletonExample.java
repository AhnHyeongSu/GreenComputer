package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton(); //컴파일 에러
		 Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		
		Singleton obj1 = Singleton.getInstance(); // ex) 0x10번지의 주소를 받는다
		Singleton obj2 = Singleton.getInstance(); // ex) 위와 동일한 주소를 받는다
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
