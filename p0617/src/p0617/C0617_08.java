package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		if(a>0) {
			System.out.println("양수입니다.");
		}else if(a==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		if(a>0) 
			System.out.println("양수입니다."); 
		else if(a==0) 
			System.out.println("0입니다.");
		else 
			System.out.println("음수입니다.");
		
		
		// 숫자를 입력받아, 양수,음수,0 입니다. 라고 출력될수 있도록 구현하시오.
		
//		System.out.println("숫자를 입력하세요.>> ");
//		int x = scan.nextInt();
//		String str = x>0?"양수입니다.":(x==0?"0입니다.":"음수입니다.");
//		System.out.println(str);
		
		
		
		
//		System.out.println("숫자를 입력하세요.>> ");
//		int x = scan.nextInt();
//		int absX = x>=0?x:-x;
//		System.out.println(absX);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.>> ");
//		String str = scan.nextLine();
//		System.out.println("입력한 문자의 길이 : "+str.length());

	}

}
