package p0625;

public class Triangle extends Shape {

	Point[] p; //인스턴스 변수
	
	Triangle(){ } //기본생성자는 반드시 구현
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1,Point p2,Point p3){
		p = new Point[] {p1,p2,p3};
	}
	
}
