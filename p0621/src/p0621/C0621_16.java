package p0621;

public class C0621_16 {

	public static void main(String[] args) {
		// 1-10,J,Q,K 13장 * 무늬 4개 = 52장 카드
		// 무늬 : CLOVER,DIAMOND,SPADE,HAERT
		// 숫자 : 1,2,3,4,5,6,7,8,9,10,11-J,12-Q,13-K
		String[] kind = {"CLOVER","DIAMOND","SPADE","HAERT"};
		String[] number = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Card[] c = new Card[52];
		c[0] = new Card("CLOVER",1);
		c[1] = new Card("CLOVER",2);
		c[13] = new Card();
		c[13].kind = "DIAMOND";
		c[13].number = 1;
		
		
		//(int)(i/13) 
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(kind[i/13],(i%13)+1); //객체선언을 해야 저장공간생성
//			c[i].kind = kind[i/13]; //데이터 입력
//			c[i].number = (i%13)+1; //데이터 입력
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,number[c[i].number]);
			
//			if(c[i].number==11)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"J");
//			else if(c[i].number==12)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"Q");
//			else if(c[i].number==13)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"K");
//			else
//				System.out.printf("무늬 : %s,숫자 : %d \n",c[i].kind,c[i].number);
		}
		
		
		
		
		
		

	}

}
