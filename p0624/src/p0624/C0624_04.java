package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			num[i] = scan.nextInt();
		}
		
		//객체선언후, 참조변수명.메소드명
		Cal c = new Cal();
		
		int result = c.add(num[0],num[1],num[2]);
		
		int sum = c.add2(num);
		
		System.out.println("합계 :"+result);
		
		
		
		
		
		
		
		//세개의 수를 입력받아, 세개의 수를 더한 값을 출력하시오.
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		System.out.println("합계 : "+sum);
		
		//더하기 결과값 1
//		System.out.println("더하기 결과값 : "+(num[0]+num[1]+num[2]));
		//더하기 결과값 2
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			sum += num[i];
//		}
//		System.out.println("합계 : "+sum);

	}//main

}//class
