package p0614;

public class C0614_10 {

	public static void main(String[] args) {
		// 전위형 증감연산자
//		int i = 5;
//		int j = 0;
//		j = ++i; //i:5 +1 = 6
//		System.out.println(j);
		
		//후위형 증감연산자
		int i = 5;
		int j = 0;
		j = i++; //i:5 -> j에 넣음. i+1=6
		System.out.println("j : "+j);
		System.out.println("i : "+i);
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		System.out.println(bol1 == bol2);
		System.out.println(bol1 != bol2); //1과 2가 다르냐? 다르면 true, 같으면 false
		
		
		
		
		
		

	}

}
