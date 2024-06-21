package p0621;

public class C0621_07 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println("--------");
		
		change(d.x); //클래스메소드 - 객체선언없이 클래스명.메소드명
		
		System.out.println("change호출후 d.x : "+d.x);
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change x : "+x);
	}
	
	

}
