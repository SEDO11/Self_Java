package sec02.exam09;
//�簢���� ���� ���ϱ�
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ���� ���ϱ�");
		
		System.out.print("�غ��� ���̸� �Է��ϼ���> ");
		double x = sc.nextDouble();
		System.out.print("������ ���̸� �Է��ϼ���> ");
		double y = sc.nextDouble();
		
		double sum = x * y * 0.5;
		System.out.printf("�ﰢ���� ���̴� %.2f �Դϴ�.", sum);
		

	}

}
