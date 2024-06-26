package p0626;

import java.util.ArrayList;

public class Buyer {

	String userId;
	String userPw;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10]; //인스턴스변수
	ArrayList list = new ArrayList(); //객체배열선언
//	int count; //인스턴스 변수
	
	Buyer(){}
	Buyer(String userId,String userPw,int money,int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 구매메소드 - 부모의 참조변수
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액 부족합니다.( 보유금액 : %d 만원 ) \n",money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); //객체배열 추가 - add()
//		cart[count++] = p; //구매물품 저장
		System.out.printf("%s 제품을 구매했습니다.( 보유금액 : %d 만원)\n",p.pName,money);
	}
	
	void summary() {
		System.out.println("[ 구매내역 ]");
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			Product p = (Product)list.get(i);
			System.out.println(p.pName);
			sum += p.price;
		}
		System.out.println("총 구매개수 : "+list.size());
		System.out.println("총 구매금액 : "+sum);
	}
	
	
	
//	void buy(Refrigerator r) {
//		money -= r.price;
//		bonusPoint += r.bonusPoint;
//	}
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	

	
	
}
