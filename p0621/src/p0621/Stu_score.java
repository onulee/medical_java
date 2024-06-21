package p0621;

public class Stu_score {
	
	//기본생성자
	Stu_score(){}
	
	//매개변수 생성자
	Stu_score(String stuNo,String name,int kor,int eng,int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
