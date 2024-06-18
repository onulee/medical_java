package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// if 문으로 변경
		// 990101-1011101
		// 나이를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.(ex:880101-1011111)>> ");
		// 1,2 1900 2024-1988 = 36
		// 3,4 2000 2024-2001 = 23
		String input = scan.nextLine();
		
		//7, 0,2
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		int age = 0;
		
		if(flag.equals("1") || flag.equals("2")) {
			age = 2024 - Integer.parseInt("19"+birthY);
		}else if(flag.equals("3") || flag.equals("4")) {
			age = 2024 - Integer.parseInt("20"+birthY);
		}
		
		
//		switch(flag) {
//		case "1":case "2":
//			age = 2024 - Integer.parseInt("19"+birthY); 
//			break;
//		case "3": case "4":
//			age = 2024 - Integer.parseInt("20"+birthY); 
//			break;
//		}
		
		System.out.println("당신의 나이 : "+age);

	}

}
