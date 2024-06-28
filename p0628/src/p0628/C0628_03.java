package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		// 문자열을 입력받아, 3번째의 문자를 출력하시오.
		// 문자열이 3칸 미만으로 입력이 되면, 다시 입력을 할수 있도록 하시오.
		// 무한반복 - x,X가 입력되면 프로그램을 종료하시오.
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요.>>(X.종료)");
			String str = scan.nextLine();
			if(str.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(str.length()<3) {
				System.out.println("문자열 길이가 너무 짧습니다. 다시 입력하세요.");
				continue;
			}
			
			System.out.println("[ 3번째 문자 ]");
			System.out.println(str.charAt(2));
			
			
			
		}
		

	}

}
