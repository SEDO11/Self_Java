// ÿ�ø� ������
package python50_100;

import java.util.*;

public class Exam11098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int run = Integer.parseInt(sc.nextLine());
		for(int i=0; i<run; i++) {
			int cost = 0;
			String name = null;
			int val = Integer.parseInt(sc.nextLine());
			for(int j=0; j<val; j++) {
				String str = sc.nextLine(); // ����, �̸��� �������� ���� �Է�
		        String[] cn = str.split(" "); // ������ �������� ����, �̸� ����
		        if(cost <= Integer.parseInt(cn[0])) { // �ְ� �� ���
		        	cost = Integer.parseInt(cn[0]);
		        	name = cn[1]; // �̸� �߰�
		        }
			}
			System.out.println(name);
		}
	}

}
