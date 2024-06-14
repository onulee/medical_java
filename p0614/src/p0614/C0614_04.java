package p0614;

public class C0614_04 {

	static int num;  // 클래스 내 변수 - 자동으로 초기화가 됨.
	
	
	// 메소드 내에서는 무조건 변수값을 초기화를 해야함.
	public static void main(String[] args) {
//		int score; //자동으로 초기화가 되지 않음. 그래서 무조건 초기화를 해야 함.
//		System.out.println(score); //score를 초기화를 해 주지 않으면 에러
		System.out.println(num);   //클래스변수는 초기화를 해 주지 않아도 됨.

	}

}
