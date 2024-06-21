package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력한 두 수의 더하기,빼기,곱하기,나누기 계산결과값을 출력하시오.
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		int b = scan.nextInt();
		
//		C0621_05 c = new C0621_05();
		Cal2 c = new Cal2();
		int r1 = c.plus(a, b);
		System.out.println(r1);
		
		int r2 = c.minus(a, b);
		System.out.println(r2);
		
		int r3 = c.multi(a, b);
		System.out.println(r3);
		
		int r4 = c.divide(a, b);
		System.out.println(r4);
		
		

	}
	
	//메소드 선언
	int plus(int a, int b) {
		return a+b;
	}
	
	int minus(int a,int b) {
		return a-b;
	}
	
	int multi(int a,int b) {
		return a*b;
	}
	
	int divide(int a,int b) {
		return a/b;
	}
	
}
