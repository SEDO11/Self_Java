package dynamic_beat_4;

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

// JFrame은 자바에서 GUI 기반의 프로그램을 만들 때 사용
public class DynamicBeat extends JFrame {
	// 필드
	// 전체 화면에 대한 이미지를 담는 인스턴스
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/background1.jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));
	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/btnOn.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/btn.png"));
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	
	private int mouseX, mouseY;
	
	// 생성자
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat"); // 타이틀 제목
		setSize(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		setResizable(false); // 사용자가 창 크기를 임의로 조절하는걸 방지
		setLocationRelativeTo(null); // 창이 중앙에 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 종료시 프로그램 전체 종료, 이게 없으면 게임을 꺼도 컴퓨터 내에서 계속 실행
		setVisible(true); // 정상적일 경우 게임창 보이기
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		// 맨 위에 있는 게 GUI 이미지 상에서 맨 앞으로 옴
		// 종료 버튼
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override // 마우스 오버
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 커서 클릭 모양
				Music buttonEnteredMusic = new Music("le.mp3", false);
				buttonEnteredMusic.start();
			}
			@Override // 마우스 아웃
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 커서 기본 모양
			}
			@Override // 클릭
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic = new Music("click.mp3", false);
				buttonEnteredMusic.start();
				try { // 클릭하고 소리가 난 후 종료 하도록 예외 처리
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0); // 시스템 종료
			}
		});
		add(exitButton);
		
		// 메뉴 바
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

	// 메소드
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g); // 고정된 다른 사진을 추가
		this.repaint();
	}
}
