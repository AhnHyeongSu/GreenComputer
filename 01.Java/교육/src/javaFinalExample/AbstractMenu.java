package javaFinalExample;

import java.util.Scanner;

abstract class AbstractMenu implements Menu {	//Menu next()를 수행하지 않으므로 추상메소드 선언
	protected String menuText;
	protected Menu prevMenu;
	protected static final Scanner scanner = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}
	
	public void print() {
		System.out.print("\n" + menuText);
	}
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}

}
