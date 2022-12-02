package sec01.exam05;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;	// 합쳐가지고 Object에 리턴해주고 Object에서 같은지 확인해준다
	}
}
