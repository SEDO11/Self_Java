package chap09.sec01.exam04;

public class Outter {
	public void method1(int arg) { // final Ư���� ����
		int localVariable = 1; // final Ư���� ����
		
		// arg = 100
		// localVariable = 100;
		
		class Inner { // ����Ŭ�������� �Ű������� final Ư���� �����⿡ ���� �����ϸ� ������ ���.
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
