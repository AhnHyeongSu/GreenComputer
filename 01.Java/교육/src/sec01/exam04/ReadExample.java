package sec01.exam04;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		while(true) {
			int data = is.read();
			if(data == -1) break;	//파일을 다 읽으면 마지막에 -1을 보낸다
			System.out.println(data);
		}
		is.close();
		
	}

}
