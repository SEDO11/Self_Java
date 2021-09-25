package translate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String cCode = "#include <stdio.h>\nint main() {\nFILE *f1, *f2; \nchar c;\n"; //�⺻ �ڵ� ����
        try{
            //���� ��ü ����
            File file = new File("src/test.n");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            //text.n �� �پ� �б�
            String line = "";
            //���� �� ����
            while((line = bufReader.readLine()) != null){ 
            	System.out.println(line);
            	//�ڵ� ���� Ȯ��, ������ ��Ȯ�ϸ� ����
            	boolean run = Trans.gramCheck(line);
            	if(run) {
            		cCode += Trans.translate(line);
            	} else {
            		Trans.error();
            	}
            }         
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
        
        //c�ڵ� ���� �����
        try {
        	File file = new File("src/test.c");
        	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(cCode);
            writer.write("return 0; \n}"); //������
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
