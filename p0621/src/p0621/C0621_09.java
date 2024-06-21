package p0621;

import java.util.Arrays;

public class C0621_09 {

	public static void main(String[] args) {
		//객체선언
		Cal2 c = new Cal2();
		
		int a = 10;
		int b = 3;
		double[] arr = new double[4]; //arr:참조형변수
		
		c.cal(a,b,arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
