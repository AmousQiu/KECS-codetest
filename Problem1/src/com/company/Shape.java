import java.util.ArrayList;
import com.company.Point;
public class Shape {
	
	// 定义ArrayList<Point> list成员
	//实现get list成员方法
	//实现set list成员方法
	public Point com(ArrayList<Point> list){
		
		int count = list.size();
		Point centroid = new Point();
		
		//如果不是多边形，不进行质心的计算
		if(count < 3){
			return null;
		}else{
			Point p0 = list.get(0);
			//如果是三角形
			if(count == 3){
				centroid = TriangleCentroid(p0, list.get(1), list.get(2));
			 }else{
				Point tempCentroid1 = new Point();
				Point tempCentroid2 = new Point();
				 //将列表一分为二，以第一个点为一端将多边形分割成两个多边形，递归调用com方法
				 int midNum = (int)count/2;
				 ArrayList<Point> list1 = new ArrayList<Point>();
				 for(int i=0;i<midNum+1;i++){
					 list1.add(list.get(i));
				 }
				 				 
				 //注意表2要加入第一个点，并且第midNum点两个多边形复用
				 ArrayList<Point> list2 = new ArrayList<Point>();
				 list2.add(p0);
				 for(int i=midNum;i<count;i++){
					 list2.add(list.get(i));
				 }
				 
tempCentroid1 = com(list1);
tempCentroid2 = com(list2);
				 //下面计算两个多边形合起来的质心和面积
				 double area = tempCentroid1.getArea()+tempCentroid2.getArea();
				 centroid.setArea(area);
				 
				 double x = (tempCentroid1.getX()*tempCentroid1.getArea()+tempCentroid2.getX()*tempCentroid2.getArea())/area;
				 centroid.setX(x);
				 
				 double y = (tempCentroid1.getY()*tempCentroid1.getArea()+tempCentroid2.getY()*tempCentroid2.getArea())/area;
				 centroid.setY(y);
			 }
		}
		return centroid;
	}
	
	//计算三角形质心+面积
	public static Point TriangleCentroid(Point p1, Point p2, Point p3)
	{
		Point centroid = new Point();
		
		double x = (p1.getX()+p2.getX()+p3.getX())/3;
		double y = (p1.getY()+p2.getY()+p3.getY())/3;
		centroid.setLocation(x, y);
		
		double area = 0.0;
		area = (p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p1.getY()
				-p1.getX()*p3.getY()-p2.getX()*p1.getY()-p3.getX()*p2.getY())/2;
		
		centroid.setArea(area);
		
		return centroid;
	}
}
