package sec02.exam10;
// ���� �ѳ���, ���� ���ϴ� �ڵ�
import java.util.*;

public class Globe {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �������� �Է��ϼ���.> ");
		double r = sc.nextDouble();
		double area = 4 * PI * r * r;
		double volume = (4/3) * PI * r * r * r;
		
		System.out.printf("���� �ѳ���: %.3f m^2\n", area);
		System.out.printf("���� ����:  %.3f m^3\n", volume);

	}

}
