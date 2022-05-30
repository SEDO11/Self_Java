// �� Ŭ����
package sec09.Test;

public class Circle {
	private Point2D center; // �߽� ��ǥ
	private int radius = 0; // ������
	
	public Circle() { center = new Point2D(); }
	public Circle(Point2D c, int radius) { 
		center = new Point2D(c);
		this.radius = radius;
	}
	public Point2D getCenter() {
		return new Point2D(center);
	}
	public int getRadius() {
		return radius;
	}
	public void setCenter(Point2D c) {
		center.set(c.getX(), c.getY());
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	boolean equalTo(Circle p) {
		return radius==p.radius&&center.getX()==p.getCenter().getX()
				&&center.getY()==p.getCenter().getY();
	}
	public String toString() {
		return " �߽� ��ǥ :"+center.toString()+"������ :"+radius;
	}
}
