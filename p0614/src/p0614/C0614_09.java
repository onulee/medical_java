package p0614;

import java.util.Scanner;

public class C0614_09 {

	public static void main(String[] args) {
		int sca = 0;
		Scanner scan = new Scanner(System.in);
		
		// 두숫자를 입력받아, 덧셈,뺄셈,곱셈,나눗셈을 출력하시오.
		System.out.println("1번째 숫자를 입력하세요.>>");
		int num = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.>>");
		int num2 = scan.nextInt();
		
		System.out.println( "덧셈 : "+(num+num2) );
		System.out.println("뺄셈 : "+(num-num2));
		System.out.println("곱셈 : "+(num*num2));
		System.out.println("나눗셈 : "+(num/num2));
		

	}

}
