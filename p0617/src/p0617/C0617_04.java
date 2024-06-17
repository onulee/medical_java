package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char ch = 'a';
		System.out.println((char)(ch-32));
		
		char ch2 = 'A';
		System.out.println((char)(ch2+32));
		
		char ch3 = '3';
		char ch4 = '2';
		System.out.println(ch3+ch4); //0:48, 1:49,2:50,3:51
		
		//문자 숫자타입을 정수타입으로 변경하는 방법 : '0'문자 0을 빼줌.
		System.out.println((ch3-'0')+(ch4-'0'));
		
		
//		int a = 1000000;
//		int b = 1000000;
//		System.out.println(a*(long)b);
		
//		char ch = 'A'; //A:65 a:97 0:48
//		char ch2 = 'B';
//		System.out.println(ch+ch2);
		
//		System.out.println("숫자를 입력하세요.");
//		String str = scan.nextLine();
//		// String 참조형 변수
//		int n = Integer.parseInt(str); //문자열을 정수형으로 변환
//		System.out.println("숫자를 입력하세요.");
//		String str2 = scan.nextLine();
//		int n2 = Integer.parseInt(str2);
//		
//		System.out.println("두수의 합 : "+(n+n2));
		
		
//		System.out.println("숫자를 입력하세요.");
//		int n = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int n2 = scan.nextInt();
//		System.out.println("두수의 합 : "+(n+n2));

	}

}
