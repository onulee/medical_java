package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
		
		// 입력한 숫자를 소수점 2자리까지 남기고 절사하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.(소수점 5자리까지) >>");
		double input = scan.nextDouble();
//		double s_input = (int)(input*100)/100d; //절사 floor()
		double s_input = Math.floor(input*100)/100d; //버림 floor()
//		double s_input = Math.round(input*100)/100d; //반올림 round()
//		double s_input = Math.ceil(input*100)/100d; //올림 ceil()
		System.out.println(s_input);
		
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*100)/100f;
//		System.out.println(shortPi);
		

	}

}
