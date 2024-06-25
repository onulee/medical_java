package p0625;

public class Singleton {
	
	private int hour; //인스턴스변수
	//클래스변수 - 객체선언없이, 클래스명.변수명
	private static Singleton s = new Singleton();
	
	private Singleton(){} //기본생성자
	
	//클래스메소드 - 객체선언없이, 클래스명.메소드명
	public static Singleton getInstance() {
		return s;
	}

}
