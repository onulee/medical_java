package p0624;

public class Element {
 
	void allCal(int a,int b,int[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
	int cal(int a,int b) {
		return a+b;
	}
	int cal2(int a,int b) {
		return a-b;
	}
	int cal3(int a,int b) {
		return a*b;
	}
	int cal4(int a,int b) {
		return a/b;
	}
}
