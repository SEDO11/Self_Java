package chap08.sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp; // A�� ����
		ia.methodA();
		
		InterfaceB ib = imp; // B�� ����
		ib.methodB();
		
		InterfaceC ic = imp; // ABC �� ����, �������̽� �� ���� ����ϱ� ������
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
