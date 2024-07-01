package p0701;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStream_Filesave {

	public static void main(String[] args) {
		File f = new File("c:/save1");
		if(!f.exists()) f.mkdir();
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/n.jpg");
			FileOutputStream fos = new FileOutputStream("c:/save1/n2.jpg");
			while(true) {
				int read = fis.read();
				if(read==-1) break;
				fos.write(read);
			}
//			while((read = fis.read()) != -1) { //fis.read() 파일의 데이터를 읽어옴. read에 데이터 넣어줌. read -1이면 종료
//				fos.write(read);
//			}
			fis.close();
			fos.close();
		} catch (Exception e) {	e.printStackTrace();}
		
		System.out.println("이미지 파일이 복사되었습니다.!");

	}

}
