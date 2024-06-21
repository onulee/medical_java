package p0621;

import java.util.Scanner;

public class C0621_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체선언
		Cal cal = new Cal(); 
		int result = cal.add(10,5);
		System.out.println("result : "+result);
		
		//객체선언
//		C0621_03 c = new C0621_03();
//		//참조변수명.메소드명
//		int result = c.add(10,5);
//		System.out.println(result);
	}
	
	//메소드 선언
	// 리턴타입과 return 결과값은 타입이 같아야 함.
	int add(int a,int b) {
		int result = a + b; //지역변수
		return result;
	}
	
	void add2(int a, int b) {
		System.out.println(a+b);
		//리턴타입이 void이면, return 이 필요 없음.
	}
	

}
