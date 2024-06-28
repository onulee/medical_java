package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		
		// [ String ]
		String str = "123";
		str = str+"12";
		System.out.println(str);
		
		// [ StringBuffer ]
//		StringBuffer sb = "123"; //에러
		StringBuffer sb = new StringBuffer("123");
//		sb = sb + "12"; //에러
		sb.append("12"); //"123" + "12"
		System.out.println(sb);
		
		int a = 10;
		int b = 5;
		int c = 100;
		System.out.println(Math.max(Math.max(a, b), c));
		Math.max(Math.max(a, b), c);
		

	}

}
