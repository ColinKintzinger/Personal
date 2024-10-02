import java.util.Objects;

public class Point {
	private int x;
	private int y;

	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
//allows user to be able to compare the data of 2 object instead of the addresses
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("this==obj");
			return true;
		}
		if (obj == null) {
			System.out.println("obj==null");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println(this.getClass());
			System.out.println(obj.getClass());
			System.out.println("getClass() != obj.getClass()");
			return false;
		}
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}
