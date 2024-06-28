package p0628;

public class Card {
	
	enum Kind{ SPADE,DIAMOND,HEART,CLOVER }
	
	private int number;
	private Kind kind;
//	private String kind;
	
	Card(){}
	Card(int number,Kind kind){
		this.number = number;
		this.kind = kind;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return String.format("%d,%s", number,kind);
	}

}
