package chap06.sec06.exam02.mycompany;

import chap06.sec06.exam02.hyndai.Engine;
import chap06.sec06.exam02.hankook.SnowTire;
import chap06.sec06.exam02.kumho.BigWidthTire;
/*
 * �ٸ���Ű���� ���� �̸��� Ŭ������ ���� ��� 
 * import ���� �ʰ� �ٷ� ��ü�� ������ �� �̸��� import �Ҷ� ó�� �ٲ��ش�.
 */

public class Car {
	//�ʵ�
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	chap06.sec06.exam02.hankook.Tire tire3 = new chap06.sec06.exam02.hankook.Tire();
	chap06.sec06.exam02.kumho.Tire tire4 = new chap06.sec06.exam02.kumho.Tire();
}