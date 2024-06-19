package p0619;

import java.util.Arrays;

public class C0619_03 {

	public static void main(String[] args) {
		int[] score = {1,2,3,4,5};
		System.out.println(score);
		int[] score2 = score; //얕은 복사 - 주소값만 복사됨.
		
		int[] score3 = new int[score.length];
		for(int i=0;i<score3.length;i++) {
			score3[i] = score[i];
		}
		
		int[] score4 = new int[5];
		System.arraycopy(score, 0, score4, 0, score.length);
		System.out.println(Arrays.toString(score4));
		
		
		//score 배열 값을 변경
		score[4] = 0;
		
		
//		System.out.println(Arrays.toString(score));
//		System.out.println(Arrays.toString(score2));
		
		
//		// 변수를 복사했을때, 기존의 값이 변경이 된다고 해서 복사한 값이 변경되지 않음.
//		int num = 10;
//		int num2 = num; //num,num2는 서로 다른 저장소에 값 저장
//		num = 5;
//		System.out.println(num);  //5
//		System.out.println(num2); //10

	}

}
