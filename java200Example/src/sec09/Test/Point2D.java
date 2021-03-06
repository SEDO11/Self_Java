// 2차원 좌표 클래스
package sec09.Test;

public class Point2D {
	private int x = 0;
	private int y = 0;
	
	public Point2D() {}
	public Point2D(int x, int y) {
		set(x, y);
	}
	public Point2D(Point2D p) {
		this(p.x, p.y);
	}
	boolean equalTo(Point2D p) {
		return x==p.x&&y==p.y;
	}
	
	public int getX() { return x;}
	public int getY() { return y;}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void set(int x, int y) {setX(x); setY(y);}
	public String toString() { return "("+x+", "+y+")"; }
}
