package sec01.exam02;

public class Key {				//HashMap에서는 해쉬코드와 이꼴 둘다 재정의 해줘야한다
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
