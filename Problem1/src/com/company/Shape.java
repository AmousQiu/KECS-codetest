import java.util.ArrayList;
import com.company.Point;
public class Shape {
	
	public Point com(ArrayList<Point> list){
		
		int count = list.size();
		Point centroid = new Point();
		
		//if it is not a shape,don't calculate
		if(count < 3){
			return null;
		}else{
			Point p0 = list.get(0);
			//if it is a triangle
			if(count == 3){
				centroid = TriangleCentroid(p0, list.get(1), list.get(2));
			 }else{
				Point tempCentroid1 = new Point();
				Point tempCentroid2 = new Point();
				//divide the list into 2 parts, devide the whole shape into two parts. 
				 int midNum = (int)count/2;
				 ArrayList<Point> list1 = new ArrayList<Point>();
				 for(int i=0;i<midNum+1;i++){
					 list1.add(list.get(i));
				 }
				 				 
				 ArrayList<Point> list2 = new ArrayList<Point>();
				 list2.add(p0);
				 for(int i=midNum;i<count;i++){
					 list2.add(list.get(i));
				 }
				 
                 tempCentroid1 = com(list1);
                 tempCentroid2 = com(list2);
			
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
	
	//calculate triangle's mass point
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
