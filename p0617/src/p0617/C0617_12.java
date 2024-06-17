package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력받아, 90점이상 A,80점이상 B,C,D,F 를 출력할수 있게 구현
		// 90~92점 A-, 97~100 A+, 80~82점 B-,97~89 B+ ..... 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>> ");
		int num = scan.nextInt();
		String score = "";
		if(num>=90) {
			score = "A";
			if(num>=97) score = score+"+";
			else if(num<=92)score = score+"-";
		}else if(num>=80) {
			score = "B";
			if(num>=87) score = score+"+";
			else if(num<=82)score = score+"-";
		}else if(num>=70) {
			score = "C";
			if(num>=77) score = score+"+";
			else if(num<=72)score = score+"-";
		}else if(num>=60) {
			score = "D";
			if(num>=67) score = score+"+";
			else if(num<=62)score = score+"-";
		}else 
			score = "F";
		
		
		System.out.println("학점 : "+score);
		
		

	}

}
