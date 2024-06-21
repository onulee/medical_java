package p0621;

public class Card {
	
	//기본생성자
	Card(){	}
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	String kind;             //인스턴스변수
	int number;              //인스턴스변수
	static int width = 100;  //클래스변수
	static int height = 250; //클래스변수

}
