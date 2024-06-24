package p0624;

public class C0624_09 {

	public static void main(String[] args) {
		
		// 객체선언후 white,auto,4
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c = new Car("white","auto",4);
		
		System.out.println("c.color : "+c.color);
		
		// 객체선언후 red,auto,5
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "auto";
		c2.door = 5;
		
		Car cc = new Car("red","auto",5);
		
		// 객체선언후 blue,auto,3
		Car c3 = new Car();
		c3.color = "blue";
		c3.gearType = "auto";
		c3.door = 3;
		
		Car ccc = new Car("blue", "auto", 3);
		
		
		
		
//		Data d = new Data();//에러없음
//		Data2 d2 = new Data2(); //에러없음.
//		Data2 d3 = new Data2(10); //에러없음
		

	}

}
