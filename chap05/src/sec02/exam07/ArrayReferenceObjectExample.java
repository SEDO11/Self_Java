package sec02.exam07;
//��ü�� ����(���ڿ�)�ϴ� �迭
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		//0�� 1�� ���� ��ü ������ �����Ѵ�
		strArray[0] = "Java";
		strArray[1] = "Java";
		
		//2�� new�� ���� ������� ������ 0, 1�̶��� �ٸ� ��ü ������ �̿��Ѵ�.
		strArray[2] = new String("Java");
		
		//==�� String���� ��ü ������ �������� ���ϴµ� ����Ѵ�.
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		//equals�� String���� ��ü�� ������ �������� ���ϴµ� ����Ѵ�.
		System.out.println(strArray[0].equals(strArray[2]));

	}

}
