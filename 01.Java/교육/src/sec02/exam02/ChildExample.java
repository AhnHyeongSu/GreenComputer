package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2();	//자식클래스에서 재정의한 것은 부모클래스에서도 사용 할 수 있다.
		
		//parent.method3(); //호출 불가능: 자식클래스에서 직접 만든것은 부모클래스가 쓸 수 없다.
	}

}
