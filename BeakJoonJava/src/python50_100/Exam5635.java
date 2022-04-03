// ����, date �Լ��� �̿��� ��¥�� ����Ͽ� ���
package python50_100;

import java.util.*;
import java.text.*;

public class Exam5635 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		String min_name = "";
		String max_name = "";
		Date min_ymd = null;
		Date max_ymd = null;
		
		int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
        	String str = sc.nextLine();
        	String[] ndmy = str.split(" ");
        	Date ymd = null;
        	if(i==0) {
        		min_ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		min_name = ndmy[0];
        		max_ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		max_name = ndmy[0];
        	} else {
        		ymd = dateFormat.parse(ndmy[3]+"-"+ndmy[2]+"-"+ndmy[1]);
        		 if(ymd.before(max_ymd)){ // ���̰� ���� ���� ��� ����
                     max_ymd = ymd;
                     max_name = ndmy[0];
                 }
                 
                 if(ymd.after(min_ymd)){ // ���̰� ���� ���� ��� ����
                 	min_ymd = ymd;
                 	min_name = ndmy[0];
                 }
        	}
        }
        System.out.println(min_name);
        System.out.println(max_name);
	}

}
