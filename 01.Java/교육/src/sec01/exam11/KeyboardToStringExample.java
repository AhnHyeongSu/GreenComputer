package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException { //Exception 은 java.lang에 살지 않기때문에, import 해줘야 한다.
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0 , readByteNo-2);
		System.out.println(str);

	}

}
