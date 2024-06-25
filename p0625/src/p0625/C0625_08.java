package p0625;

public class C0625_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("현재 보유금액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		
		Tv tv = new Tv();
		b.buy(tv);
		b.buy(tv);
		b.buy(tv);
		Computer c = new Computer();
		b.buy(c);
		b.buy(c);
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		System.out.println("현재 보유금액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		

	}

}
