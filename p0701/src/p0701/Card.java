package p0701;

public class Card {
	private String password;
	private int number;
	private String kind;
	
	public Card() {	}
	public Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return kind+","+number;
	}
	
	
	

}
