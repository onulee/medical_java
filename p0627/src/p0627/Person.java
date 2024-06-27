package p0627;

public class Person {
	long id;
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
//			Person p = (Person)obj;
//			if (id == ((Person)obj).id) return true;
//			else return false;
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "주민번호 : "+id;
	}

}
