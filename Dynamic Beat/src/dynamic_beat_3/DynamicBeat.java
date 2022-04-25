package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// JFrame�� �ڹٿ��� GUI ����� ���α׷��� ���� �� ���
public class DynamicBeat extends JFrame{
	//�ʵ�
	//��ü ȭ�鿡 ���� �̹����� ��� �ν��Ͻ�
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	// ������
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // Ÿ��Ʋ ����
		setSize(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		setResizable(false); // ����ڰ� â ũ�⸦ ���Ƿ� �����ϴ°� ����
		setLocationRelativeTo(null); // â�� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ����� ���α׷� ��ü ����, �̰� ������ ������ ���� ��ǻ�� ������ ��� ����
		setVisible(true); // �������� ��� ����â ���̱�
		
		introBackground = new ImageIcon(Main.class.getResource("../images/background1.jpg")).getImage();
		
		Music introMusic = new Music("intromusic.mp3", true);
		introMusic.start();
	}
	
	//�޼ҵ�
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCRENN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
