package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		//1-100까지, 랜덤숫자 10개를 생성해서, 10개의 숫자의 합을 출력하시오.
		
		int sum = 0; //합계
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*100)+1;
			System.out.printf("랜덤숫자 : %d \n",n);
			sum += n;
		}
		
		System.out.println("합계 : "+sum);
		
	}

}
