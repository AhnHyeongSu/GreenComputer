package sec01.exam07;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {	//synchronized 동기화, 하나의 스레드만 실행
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}

}
