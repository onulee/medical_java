package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",2000,0);
		
		
		// Tv 구매
		Product t = new Tv(); //다형성
		Product t2 = new Tv();
		b.buy(t);        //Tv 1대 구매
		b.buy(t2); //Tv 1대 구매
		
		// 컴퓨터구매
		Product c = new Computer();
		b.buy(c);
		
		// Audio구매
		Product a = new Audio();
		b.buy(a);
		
		Product r = new Refrigerator();
		b.buy(r);
		b.buy(new Refrigerator());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Refrigerator());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		//cart 제품명,가격을 모두 출력하시오.
		b.summary();
		
		
//		System.out.println("[ 구매내역 ]");
//		int sum = 0;
//		for(int i=0;i<b.list.size();i++) {
//			Product p = (Product)b.list.get(i);
//			System.out.println(p.pName);
//			sum += p.price;
//		}
//		System.out.println("총 구매개수 : "+b.list.size());
//		System.out.println("총 구매금액 : "+sum);
		

	}

}
