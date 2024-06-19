package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		// 퀴즈
		// 5,5배열을 생성해서 1,1,1,1,1,나머지는 0으로 채워서 랜덤으로 섞어, 출력하시오.
		//1. 번호확인 배열
		int[][] arr = new int[5][5];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;
		arr[0][4] = 1;
		
		//2. 번호섞기
		int no = 0,no2 = 0;
		int t_value = 0;
		for(int i = 0;i<300;i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		
		//-------------------------------

		// 번호맞추기 화면
		String[][] lotto = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				lotto[i][j] = "♥";
			}
		}
		
		while(true) {
			
			//3. 번호출력
			System.out.println("            [ 좌표 ]");
			System.out.println("   |\t0\t1\t2\t3\t4\t");
			System.out.println("-------------------------------------------------");
			for(int i=0;i<5;i++) {
				System.out.print(i+"  |\t");
				for(int j=0;j<5;j++) {
					System.out.printf("%s\t",lotto[i][j]);
				}
				System.out.println();
			}
			
			
			//4. 좌표입력
			Scanner scan = new Scanner(System.in);
			System.out.println("-------------------------------------------------");
			System.out.println("가로 좌표를 입력하세요.");
			int x = scan.nextInt();
			System.out.println("세로 좌표를 입력하세요.");
			int y = scan.nextInt();
			
			//좌표값 확인
			if(((x<0 || x>4) || (y<0 || y>4))) {
				System.out.println("잘못 된 좌표입니다. 다시 입력하세요.!");
				System.out.println();
				continue;
			}
			
			// 입력받은 좌표값이 확인이 된 좌표인지 체크  - String
			if(lotto[x][y].equals("꽝") || lotto[x][y].equals("당첨")) {
				System.out.println("확인된 좌표입니다. 다시 입력하세요.!");
				System.out.println();
				continue;
			}
			
			
			
			//5. arr배열에서 x,y의 좌표 값을 비교
			// 1이면 당첨, 0이면 꽝 출력되도록 하려고 함.
			
			if(arr[x][y] == 1) {
				lotto[x][y] = "당첨";
			}else {
				lotto[x][y] = "꽝";
			}
			
		}//while
		
		
		
		
		
		
		
		
		
		//3. 1번번호 랜덤 출력
//		System.out.println("            [ 좌표 ]");
//		System.out.println("   |\t0\t1\t2\t3\t4\t");
//		System.out.println("-------------------------------------------------");
//		for(int i=0;i<5;i++) {
//			System.out.print(i+"  |\t");
//			for(int j=0;j<5;j++) {
//				System.out.printf("%d\t",arr[i][j]);
//			}
//			System.out.println();
//		}

	}

}
