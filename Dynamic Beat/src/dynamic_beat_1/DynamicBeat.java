package dynamic_beat_1;

import javax.swing.JFrame;

// JFrame�� �ڹٿ��� GUI ����� ���α׷��� ���� �� ���
public class DynamicBeat extends JFrame{
	
	public DynamicBeat() { // ������
		setTitle("Dynamic Beat"); // Ÿ��Ʋ ����
		setSize(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		setResizable(false); // ����ڰ� â ũ�⸦ ���Ƿ� �����ϴ°� ����
		setLocationRelativeTo(null); // â�� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ����� ���α׷� ��ü ����, �̰� ������ ������ ���� ��ǻ�� ������ ��� ����
		setVisible(true); // �������� ��� ����â ���̱�
	}
}
