package p0619;

public class C0619_02 {

	public static void main(String[] args) {
		//1-45까지 로또번호를 생성해서, 랜덤으로 섞은 후, 출력하시오.
		
		int[][] arr = new int[5][5];
		//1-25까지 번호를 넣고, 랜덤으로 섞은 후, 출력하시오.
		//[5,5] 출력하시오.
		
		//2차원배열 번호 넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = 5*i+(j+1); //
			}
		}
		
		//2차원배열 섞기
		int no = 0;
		int no2 = 0;
		int t_value = 0;
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*5); //0-4
			no2 = (int)(Math.random()*5); //0-4
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2]; //랜덤값을 0번째배열에 입력
			arr[no][no2] = t_value;
		}
		
		//2차원배열 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
//		int[] ball = new int[25]; //0-44
//		for(int i=0;i<25;i++) {
//			ball[i] = i+1; //1-45
//		}
//		
//		//2. ball배열 섞기
//		int no = 0;       //0번째 배열과 바꿀 배열번호
//		int t_value = 0;  //임시적으로 저장하는 공간
//		
//		for(int i=0;i<300;i++) {
//			no = (int)(Math.random()*25); //0-44
//			t_value = ball[0];
//			ball[0] = ball[no]; //랜덤값을 0번째배열에 입력
//			ball[no] = t_value;
//		}
		
		
		
		
		
		
		
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				arr[i][j] = ball[5*i+j]; //
//			}
//		}
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
//		
//		//3. ball배열 출력
//		for(int i=0;i<25;i++) {
//			System.out.print(ball[i]+ " ");
//		}
//		System.out.println();

	}

}
