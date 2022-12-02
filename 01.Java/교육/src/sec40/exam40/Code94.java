package sec40.exam40;

class Dog{
	String name;
	int age;
}

public class Code94 {

	public static void main(String[] args) {
		Dog happy = new Dog(); // 객체를 생성합니다.
		Dog bella = new Dog(); // 객체를 생성합니다.
		happy.name = "Happy";
		happy.age = 3;
		bella.name = "Bella";
		bella.age = 2;
		
		System.out.println("나는 강아지 두 마리를 키웁니다.");
		System.out.println("한 마리는 이름이 " + happy.name +"이고,"+
		happy.age+"세 입니다.");
		System.out.println("다른 한 마리는 이름이 " + bella.name +"이고,"+
				bella.age+"세 입니다.");
		

	}

}
