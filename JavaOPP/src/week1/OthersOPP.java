package week1;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOPP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		
		// Math�� ����
		System.out.println(Math.PI);
	
		// Math�� �޼ҵ�
		System.out.println(Math.floor(1.8)); // �� ����
		System.out.println(Math.ceil(1.8)); // �� �ø�
		
		// Ŭ����
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello"); // �޼ҵ�
		f1.write(" Java");
		f1.close();
		
		// Ŭ����
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello"); // �޼ҵ�
		f2.write(" Java2");
		f2.close();
	}

}
