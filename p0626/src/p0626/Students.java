package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	
	static int count = 1;
	{ //초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		// S24001,S24002
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count++);
	}
	
	Students(){} //기본생성자
	Students(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	String getStuNo() {
		return stuNo;
	}
	
	void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	

}
