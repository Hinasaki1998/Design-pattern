package Second;
public class Line {
	Point start;
	Point end;
	public void Distance() {
		double dis;
		System.out.println("起点坐标： "+ start.x +" "+start.y);
		System.out.println("终点坐标： "+ end.x +" "+end.y);
		dis=Math.sqrt((start.x-end.x)*(start.x-end.x)+(start.y-end.y)*(start.y-end.y));
		System.out.println("两点之间的距离： "+ dis);
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

