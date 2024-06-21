package p0621;

public class C0621_08 {

	public static void main(String[] args) {
		Data d = new Data(); //객체선언 d:참조형변수
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println("--------");
		
		change(d); // d:참조형 변수
		
		System.out.println("change호출후 d.x : "+d.x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change x : "+d.x);
	}

}
