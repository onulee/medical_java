package p0625;


public class C0625_02 {

	public static void main(String[] args) {
		
		Deck d = new Deck(); //52장 카드생성 - number,kind
		
		// 카드섞기
		d.shuffle();
		
		// 5장을 뽑는 메소드를 구현해서 실행하시오.
		Card[] cc = d.pick5();
		
		for(int i=0;i<cc.length;i++) {
			System.out.printf("카드%d : [ %s,%d ] \n",i+1,cc[i].kind,cc[i].number);
		}
		
		Card[] cc2 = d.pick5();
		
		for(int i=0;i<cc2.length;i++) {
			System.out.printf("카드%d : [ %s,%d ] \n",i+1,cc2[i].kind,cc2[i].number);
		}
		
		System.out.println("card 객체 : "+cc2[0]);
		
		// 카드섞기
//		d.shuffle();
		
		// 1장 뽑기
//		Card card = d.pick();
//		System.out.printf("카드1장 : %s,%d \n",card.kind,card.number);
//		
//		Card card3 = d.pick(3);
//		System.out.printf("카드1장 : %s,%d \n",card3.kind,card3.number);
//		
//		
//		//1장 뽑기
//		Card card2 = d.pick();
//		System.out.printf("카드1장 : %s,%d \n",card2.kind,card2.number);
//		
		
		//출력부분
//		for(int i=0;i<52;i++) {
//			System.out.printf("카드%d : [ %s,%d ] \n",i+1,d.c[i].kind,d.c[i].number);
//		}
		
		

	}

}
