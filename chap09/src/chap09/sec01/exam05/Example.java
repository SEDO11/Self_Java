package chap09.sec01.exam05;

public class Example {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
