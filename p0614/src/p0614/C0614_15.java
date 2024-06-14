package p0614;

public class C0614_15 {

	public static void main(String[] args) {
		System.out.println((float)0.1000000d==0.1000000f);
		double num = 0.1d;
		System.out.println("double타입 : "+num);
		
		double d = (double)0.1f;
		System.out.println("float타입변경 : "+d);

	}

}
