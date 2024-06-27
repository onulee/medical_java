package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			//예외가 발생 될것 같은 경우
			System.out.println(3);
			System.out.println(0/0); //error
			System.out.println(4);
		
		}catch(Exception e) {
			System.out.println(5);
			e.printStackTrace();
		}
		
		System.out.println(6);

	}

}
