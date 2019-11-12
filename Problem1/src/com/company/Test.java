import com.company.Point;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args){
		ArrayList<Point> list1 = new ArrayList<Point>();
		Point e1 = new Point(0.0, 0.0);
		list1.add(e1);
		Point e2 = new Point(0.0, 4.0);
		list1.add(e2);
		Point e3 = new Point(3.0, 0.0);
		list1.add(e3);
		//长方形
//		Point e4 = new Point(3.0, 4.0);
//		list1.add(e4);
		Shape sh = new Shape();
		
		Point center = sh.com(list1);
		System.out.println("x:"+center.getX()+" y:"+center.getY()+" area:"+center.getArea());
	}
}
