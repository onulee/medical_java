package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	
	//serialNo자동생성
	static int count = 1;
	{ //초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		// C20240001,C20240002
		this.serialNo = "C"+sdf.format(d)+String.format("%04d", count++);
	}
	
	Car(){}
	Car(String color,int door){
		this.color = color;
		this.door = door;
	}
	
	String serialNo;
	String color;
	int door;

}
