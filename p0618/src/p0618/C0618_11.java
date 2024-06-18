package p0618;

import java.util.Scanner;

public class C0618_11 {

	public static void main(String[] args) {
		
			
		
		Scanner scan = new Scanner(System.in); 
		String[] name = new String[2];
		int[][] score = new int[2][3];
		String[] title = {"이름","국어","영어","수학"};
		// 입력 2명의 학생의 성적을 입력받아 출력하시오.
		for(int i=0;i<score.length;i++) {
			System.out.println(title[0]+"을 입력하세요.");
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.println(title[j+1]+ "점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
		}
		
		// 2명의 학생성적 출력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		for(int i=0;i<2;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
//		int[] arr = new int[5];
//		int[] arr2 = {1,2,3,4,5};
		
		
//		int[][] score = new int[5][3];
//		score[0][0] = 100;
//		score[0][1] = 100;
//		score[0][2] = 100;
//		score[1][0] = 90;
//		score[1][1] = 90;
//		score[1][2] = 90;
//		score[2][0] = 80;
//		score[2][1] = 80;
//		score[2][2] = 80;
//		score[3][0] = 70;
//		score[3][1] = 70;
//		score[3][2] = 70;
//		score[4][0] = 60;
//		score[4][1] = 60;
//		score[4][2] = 60;
//		
//		int[][] score2 = {
//				{100,100,100},
//				{90,90,90},
//				{80,80,80},
//				{70,70,70},
//				{60,60,60}
//		};
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}

	}

}
