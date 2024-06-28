package p0628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C0628_07 {

	public static void main(String[] args) {
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students("홍길동", 100, 100, 99));
		list.add(new Students("유관순", 80, 100, 99));
		list.add(new Students("이순신", 100, 50, 99));
		list.add(new Students("강감찬", 40, 100, 99));
		list.add(new Students("김구", 100, 100, 100));
		list.add(new Students("김유신", 100, 80, 80));
		
		//합계 순차,역순정렬
//		list.sort(new Comparator<Students>() {
//			@Override
//			public int compare(Students o1, Students o2) {
////				return o1.total - o2.total;
//				return o2.total - o1.total;
//			}
//		});
		
		//이름 순차,역순정렬
		list.sort(new Comparator<Students>() {
			@Override
			public int compare(Students o1, Students o2) {
//				return o1.name.compareTo(o2.name);
				return o2.name.compareTo(o1.name);
			}
		});
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
//		ArrayList<Card> list = new ArrayList();
//		list.add(new Card(1,"SPADE"));
//		list.add(new Card(2,"DIAMOND"));
//		list.add(new Card(5,"HEART"));
//		list.add(new Card(4,"CLOVER"));
//		list.add(new Card(3,"SPADE"));
//		//[ 숫자형 정렬 ]
////		list.sort(new Comparator<Card>() {
////			@Override
////			public int compare(Card o1, Card o2) {
////				return o1.number-o2.number;
//////				return o2.number-o1.number;
////			}
////		});
//		
//		// [ 문자열 정렬 ]
//		list.sort(new Comparator<Card>() {
//			@Override
//			public int compare(Card o1, Card o2) {
////				return o1.kind.compareTo(o2.kind); //순차정렬 
//				return o2.kind.compareTo(o1.kind); //역순정렬
//			}
//		});
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
		
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add(7);
//		list.add(8);
//		list.add(5);
//		list.add(4);
//		list.add(2);
////		Collections.sort(list); //순차정렬
//		Collections.sort(list, Collections.reverseOrder()); //역순정렬
//		System.out.println(list);

	}

}
