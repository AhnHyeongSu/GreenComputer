package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.filed1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();	//정적 멤버 클래스는 객체(new)선언을 안해도 되지만,
		c.filed1 = 3;		//filed1,method1 은 정적 메소드가 아니므로 new 선언을 해준다.
		c.method1();
		A.C.filed2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}

}
