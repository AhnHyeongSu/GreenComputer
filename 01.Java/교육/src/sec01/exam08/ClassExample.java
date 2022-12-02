package sec01.exam08;

import sec01.exam06.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		//첫 번째 방법
		Class clazz = Car.class;
		
		//두 번째 방법
		//Class clazz = Class.forName("sec01.exam06.Car");
		
		//세 번째 방법
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getTypeName());
		System.out.println(clazz.getClass());
		System.out.println(clazz.getSuperclass());
				
	}

}
