package p0619;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C0619_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int input = 0; //입력받을 값
		int count = 0; //도전 횟수
		
		while(true) {
//			System.out.println("숫자를 입력하세요.>> ");
//			input = scan.nextInt();
			String str = JOptionPane.showInputDialog("숫자를 입력하세요.(-1:종료)");
			count++;
			
			input = Integer.parseInt(str);
			
			if(input==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(num>input) {
				System.out.println("더 큰수를 입력하세요.!");
			}else if(num<input) {
				System.out.println("더 작은수를 입력하세요.!");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			
			
			
		}

	}

}
