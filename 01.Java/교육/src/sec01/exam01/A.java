package sec01.exam01;

/**바깥 클래스**/
public class A {
	A() { System.out.println("A 객체가 생성됨"); }
	
	/**인스턴스 멤버 클래스**/
	class B {
		B() { System.out.println("B 객체가 생성됨"); }
		int filed1;
		//static int filed2;
		void method1() {System.out.println("B클래스의 method1 실행");}
		//static void method2() {}
	}
	
	/**정적 멤버 클래스**/
	static class C {
		C() {System.out.println("C 객체가 생성됨");}
		int filed1;
		static int filed2;
		void method1() {System.out.println("C클래스의 method1 실행");}
		static void method2() {System.out.println("C클래스의 method2 실행");}
	}
	void method() {
		/**로컬 클래스**/
		class D {
			D() {System.out.println("D 객체가 생성됨");}
			int filed1;
			//static int filed2;
			void method1() {System.out.println("D클래스의 method1 실행");}
			//static void method2() {}			
		}
		D d =new D();
		d.filed1 = 3;
		d.method1();
	}
}
