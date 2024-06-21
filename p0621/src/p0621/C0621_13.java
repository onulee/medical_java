package p0621;

public class C0621_13 {

	public static void main(String[] args) {
		int a = 0;
		float b = 1.0f;
		double c = 2.0;
		String str = "안녕하세요.";
		char ch = 'A';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch);

	}
	
	// 매개변수 개수, 타입이 다르면 오버로딩 - 전혀 다른 메소드임.
	int add(int a, int b) {return a+b;}
	long add(int a, long b) {return a+b;}
	
	

}
