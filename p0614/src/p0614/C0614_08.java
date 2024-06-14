package p0614;

import java.util.Scanner;

public class C0614_08 {

	public static void main(String[] args) {
//		input("문자를 입력하세요.");
//		java.util.Scanner scan2 = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in); //객체선언
		
		// 숫자 - nextInt(), nextDouble()
		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
		String num = scan.nextLine();
		System.out.println("숫자2를 입력하세요.");
		String num2 = scan.nextLine();
		
		// 기본형 타입 같은 경우, 형변환
		// String 참조형 타입
		int number = Integer.parseInt(num); //참조형 문자열타입을 정수형타입으로 변경
		int number2 = Integer.parseInt(num2);
		
		System.out.println("입력한 숫자 : "+(number+number2));
		
		
//		// 문자열 - next()- 사이띄우기 전까지만 입력받음, enter키를 입력받지 않음.
//		//        nextLine() - 문자 사이띄우기 가능
//		System.out.println("3번째 문자를 입력하세요.");
//		String str3 = scan.nextLine();
//		System.out.println("입력한 문자3 : "+str3);
//		
//		System.out.println("문자를 입력하세요.");
//		String str = scan.next();
//		System.out.println("입력한 문자 : "+str);
//		
//		System.out.println("2번째 문자를 입력하세요.");
//		String str2 = scan.next();
//		System.out.println("입력한 문자2 : "+str2);
		
		
		
		
		
		
		
		

	}

}
