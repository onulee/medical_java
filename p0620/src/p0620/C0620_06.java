package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));
		
		
		int num = 0;
		int num2 = 10;
		
		num2 = num;
//		num2 = 10|0;
		
		
		//객체선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		// 0 
		System.out.println("t2 ch : "+t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t2 ch : "+t2.channel);
		
		
		
		
		
		
		// Class는 객체선언
//		Tv t = new Tv();
//		// 참조변수명.변수명 값을 넣을수 있음.
//		t.channel = 7;
//		t.channelUp();
//		System.out.println("현재채널 : "+t.channel); //8
//		t.channelDown(); //7
//		t.channelDown(); //6
//		System.out.println("현재채널 : "+t.channel);
		

	}

}
