package dynamic_beat_5;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// JFrame�� �ڹٿ��� GUI ����� ���α׷��� ���� �� ���
public class DynamicBeat extends JFrame {
	// �ʵ�
	// ��ü ȭ�鿡 ���� �̹����� ��� �ν��Ͻ�
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image background = new ImageIcon(Main.class.getResource("../images/background1.jpg")).getImage(); // ���ȭ�� ����
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png"))); // �޴���
	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/btnOn.png")); // ������ ��ư ���콺 ���� 
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/btn.png")); // ������ ��ư �⺻
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png")); // ���� ��ư ���콺 ����
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png")); // ���� ��ư �⺻
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png")); // ���� ��ư ���콺 ���� 
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png")); // ���� ��ư �⺻
	
	
	private JButton exitButton = new JButton(exitButtonBasicImage); // ������ ��ư
	private JButton startButton = new JButton(startButtonBasicImage); // ���� ��ư
	private JButton quitButton = new JButton(quitButtonBasicImage); // ���� ��ư
	
	private int mouseX, mouseY; // ���콺 ��ǥ ����
	
	// ������
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat"); // Ÿ��Ʋ ����
		setSize(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		setResizable(false); // ����ڰ� â ũ�⸦ ���Ƿ� �����ϴ°� ����
		setLocationRelativeTo(null); // â�� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ����� ���α׷� ��ü ����, �̰� ������ ������ ���� ��ǻ�� ������ ��� ����
		setVisible(true); // �������� ��� ����â ���̱�
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		// �� ���� �ִ� �� GUI �̹��� �󿡼� �� ������ ��
		
		// exit ��ư
		exitButton.setBounds(1245, 0, 30, 30); // ��ư�� x, y �� ��ġ�� x , y ũ�� ��ŭ ��ġ
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override // ���콺 ����
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Ŀ�� Ŭ�� ���
				Music buttonEnteredMusic = new Music("le.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override // ���콺 �ƿ�
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Ŀ�� �⺻ ���
			}
			@Override // Ŭ��
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("click.mp3", false);
				buttonEnteredMusic.start();
				try { // Ŭ���ϰ� �Ҹ��� �� �� ���� �ϵ��� ���� ó��
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0); // �ý��� ����
			}
		});
		add(exitButton);
		
		// start ��ư
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override // ���콺 ����
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Ŀ�� Ŭ�� ���
				Music buttonEnteredMusic = new Music("le.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override // ���콺 �ƿ�
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Ŀ�� �⺻ ���
			}
			@Override // Ŭ��
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("click.mp3", false);
				buttonEnteredMusic.start();
				startButton.setVisible(false);
				quitButton.setVisible(false);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
			}
		});
		add(startButton);

		// quit ��ư
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override // ���콺 ����
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Ŀ�� Ŭ�� ���
				Music buttonEnteredMusic = new Music("le.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override // ���콺 �ƿ�
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Ŀ�� �⺻ ���
			}
			@Override // Ŭ��
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("click.mp3", false);
				buttonEnteredMusic.start();
				try { // Ŭ���ϰ� �Ҹ��� �� �� ���� �ϵ��� ���� ó��
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0); // �ý��� ����
			}
		});
		add(quitButton);
		
		// �޴� ��
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter( ) {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter( ) {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);

		Music introMusic = new Music("intromusic.mp3", true);
		introMusic.start();
	}

	// �޼ҵ�
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintComponents(g); // ������ �ٸ� ������ �߰�
		this.repaint();
	}
}
