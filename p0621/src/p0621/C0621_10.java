package p0621;

public class C0621_10 {

	public static void main(String[] args) {
		// 재귀호출을 사용한 팩토리얼
		C0621_10 c = new C0621_10();
		long result = c.factorial(5); //5*4*3*2*1 = 120
		System.out.println(result);
		
		// 반복문을 사용한 팩토리얼
		int count = 5;
		long re = 1;
		for(int i=count;i>=1;i--) { //5*4*3*2*1
			re *= i;
		}
		System.out.println(re);
	}
	
	long factorial(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		return result;
	}

}
