package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 구구단 출력시 2-9단까지 출력하는데 홀수단만 출력하시오.
		for(int i=2;i<=9;i++) {
			if (i%2==0) continue;
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println();
		}
		
		
		//1-10까지 합을 출력하시오.
//		int sum = 0;
//		int i = 0;
//		for(i = 1;i<=10;i++) {
//			sum += i;
//		}
//		
//		System.out.println((i-1) +"까지의 합 : "+sum);
		
		
		// 1-100까지 합을 구하는데, sum값이 150을 넘었을때 i,sum 값을 출력하시오.
		// break;
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			sum = sum + i;
//			if (sum>=5) {
//				System.out.println("i : "+ (i));
//				break;
//			}
//		}
//		System.out.println("합계 : "+sum);
		
		//구구단 중첩for문 사용
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
////				System.out.println(i + "*" + j + "=" +(i*j));
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
//		// 10번 입력 받을때 마다 합계를 출력 하시오.
//		// 5 -> 5, 10 -> 15, 10번을 출력하시오.
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			System.out.println("숫자를 입력하세요.>> ");
//			int input = scan.nextInt();
//			sum = sum + input;
//			System.out.println("합계 : "+sum);
//		}
		
		
		
		// 1-100까지 홀수만 더해서 최종값을 출력하시오.
		// 1-100까지 숫자를 더해서 출력하시오.
		
//		int sum = 0;
////		for(int i=1;i<=100;i+=2) {
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) sum = sum + i;
//		}
//		
//		System.out.println(sum);
		
		
		
		//for문
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		
//		System.out.println("최종 sum : "+sum);

	}

}
