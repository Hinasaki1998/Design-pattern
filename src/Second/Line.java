package Second;
public class Line {
	Point start;
	Point end;
	public void Distance() {
		double dis;
		System.out.println("������꣺ "+ start.x +" "+start.y);
		System.out.println("�յ����꣺ "+ end.x +" "+end.y);
		dis=Math.sqrt((start.x-end.x)*(start.x-end.x)+(start.y-end.y)*(start.y-end.y));
		System.out.println("����֮��ľ��룺 "+ dis);
	}
	Line(Point start,Point end){
		this.start=start;
		this.end=end;
	}
	public static void main(String[] args) {
		Point start = new Point(2.0,3.0);
		Point end = new Point(4.0,2.5);
		Line line = new Line(start, end);
		line.Distance();
	}
}

