package test.sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		// ���� Ÿ�� �ʱⰪ ���
		System.out.println(fiv.byteField);
		System.out.println(fiv.charField);
		System.out.println(fiv.shortField);
		System.out.println(fiv.intField);
		System.out.println(fiv.longField);
		
		// �� Ÿ�� �ʱⰪ ���
		System.out.println(fiv.booleanField);
		
		// �Ǽ� Ÿ�� �ʱⰪ ���
		System.out.println(fiv.floatField);
		System.out.println(fiv.doubleField);
		
		// ���� Ÿ�� �ʱⰪ ���
		System.out.println(fiv.arrField);
		System.out.println(fiv.strField);

	}

}
