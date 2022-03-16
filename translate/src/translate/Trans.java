package translate;

public class Trans {
	//�ʵ弱��
	private static boolean result;
	private static String fileName1;
	private static String fileName2;
	private static String textName;
	private static String textName2;
	private static int echoP;
	private static int catNameF;
	private static int catNameE;
	private static int catNameF2;
	private static int catNameE2;
	private static int i;
	
	//�ڵ� ���� üũ, (), echo, cat�� �ִ��� �˻� 
	public static boolean gramCheck(String s) {
		boolean leftParenCheck = ("(".equals(s.substring(0,1))) ? true : false; //ó���� (�� �����ϴ��� Ȯ��
		boolean rightParenCheck = (")".equals(s.substring(s.length()-1))) ? true : false; //���� )�� �������� Ȯ��
		boolean echoCheck = s.contains("(echo "); //echo�� (�� �پ� �ִ��� Ȯ��
		boolean catCheck = s.contains("(cat "); //cat�� (�� �پ� �ִ��� Ȯ��
		result = ((leftParenCheck && rightParenCheck) && (echoCheck  || catCheck)); //�ڵ尡 �ǹٸ��� t, �ǹٸ��� ������ f�� ���
		return result;
	}
	
	//�ڵ� ����
	public static String translate(String s) {
		String cCode = "";
		//echo �ڵ� ��ȯ
		if(s.contains("echo")) { //echo �ڵ� ��ȯ
			cCode += "printf(";
			echoP = s.indexOf(" ");
			cCode += s.substring(echoP+1, s.length()-2);
			cCode += "\\n";
			cCode += s.substring(s.length()-2);
			cCode += ";\n\n";
		}
		
		//cat ���� ���� �ڵ� ��ȯ a > b or b > a
		else if(s.contains("cat") && s.contains(".txt")) { // cat �ڵ� ��ȯ
			// ù ��° �ؽ�Ʈ ���� �̸� ã��
			catNameF = s.indexOf(" ")+1;
			catNameE = s.indexOf(".");
			//�ؽ�Ʈ ���� �̸� ����
			textName = s.substring(catNameF, catNameE);
			// �ؽ�Ʈ���� ���� �ڵ� a > b or b > a
			if(s.contains(">")) {
				// �� ��° �ؽ�Ʈ ���� �̸� ã��
				catNameF2 = s.lastIndexOf(" ")+1;
				catNameE2 = s.lastIndexOf(".");
				textName2 = s.substring(catNameF2, catNameE2);
				if(s.indexOf(textName) < s.indexOf(textName2)) { //text �̸� a
					fileName1 = "f1";
					fileName2 = "f2";
				} else {  //text �̸� b
					fileName1 = "f2";
					fileName2 = "f1";
				}
				cCode += fileName1 + " = fopen(\"" + textName + ".txt\", \"r\");\n";
				cCode += fileName2 + " = fopen(\"" + textName2 + ".txt\", \"w\");\n";
				cCode += "while((c = getc(" + fileName1 +")) != EOF) fputc((int)c," + fileName2 + ");\n";
				cCode += "fclose(" + fileName1 + ");\n";
				cCode += "fclose(" + fileName2 + ");\n\n";
			}
			//�ؽ�Ʈ ���� ��� a.txt or b.txt
			else {
				if(i==0) {
					fileName1 = "f1";
					i = 1;
				} else {
					fileName1 = "f2";
					i = 0;
				}
				cCode += fileName1 + " = fopen(\"" + textName + ".txt\", \"r\");\n";
				cCode += "while((c = getc(" + fileName1 +")) != EOF) printf(\"%c\",c);\n";
				cCode += "fclose(" + fileName1 + ");\n\n";
			}
		}
		System.out.println("�ڵ� ��ȯ ����\n");
		return cCode;
}
	
	public static void error(){
		System.out.println("�ڵ尡 �� �� �Ǿ����ϴ�. \n��ȯ ����\n");
	}
}