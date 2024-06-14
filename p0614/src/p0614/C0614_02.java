package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		int score=0;
//		int score; //변수는 초기화 없이 사용할수 없음.
		System.out.println(score);
		
		//문자형
		char ch = 'a';
//		char ch2 = 'abc';
		char ch3 = 'a';
		char ch4 = 'b';
		char ch5 = 'c';
		
		// 기본형타입 이외 모든 참조형타입은 new연산자를 사용해야 함.
		String str = new String("abc");
		System.out.println(str);
		
		String str2 = "abcde";
		System.out.println(str2);
		
		int max = 10;
		max = 30;
		System.out.println(max);
		
		final int MIN = 20;
//		MIN = 10; //final 상수는 값을 변경할수 없음.
		System.out.println(MIN);
		
		
		
		
		
		

	}

}
