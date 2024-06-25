package p0625;

public class Circle extends Shape{
	Point center; //중심축
	int r;        //원의 반지름
	
	Circle(){ this( new Point(0,0),100); }
	
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}

}
