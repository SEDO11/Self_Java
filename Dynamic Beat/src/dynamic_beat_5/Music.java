package dynamic_beat_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	//�ʵ�
	private Player player; // �ڹ� �Ҹ� ���̺귯��
	private boolean isLoop; // ���ѹݺ� or �ѹ� ���
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	//������
	public Music(String name, boolean isLoop) {
		// ����ó��
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	// �޼ҵ�
	public int getTime() { // ������ � ��ġ���� �����ϴ��� �˷��ִ� �޼ҵ�
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // ��������� �ϴٰ� ������ �ٸ��ɷ� �ٲٰ� ���� ��
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try { 
			do { // isLoop �� true �̸� �ش� ���� �������� �ݺ�
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
