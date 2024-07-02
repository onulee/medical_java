package p0702;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Stu_process sp = new Stu_process();
		ArrayList<Students> list = new ArrayList();
		int choice = 0;
		String stuNo="",name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg = 0;
		
		// abc파일 학생성적을 읽어서 출력하시오.
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break; 
			String[] arr = line.split(","); //"S0001,홍길동,100,100,100,300,100.0,0"
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg =  Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
		}//while
		
		//list 마지막 번호 가져오기
		String lastStr = list.get(list.size()-1).getStuNo().substring(1);
		Students.count = Integer.parseInt(lastStr)+1;
		
		loop1:while(true) {
			choice = sp.screen(list);
			
			switch(choice) {
			case 1: //성적입력
				sp.stu_input(list);
				break;
			case 2: //성적출력
				sp.stu_print(list);
				break;
			case 3: //성적수정
				sp.stu_update(list);
				break;
			case 4: //성적삭제
				sp.stu_delete(list);
				break;
			case 5: //학생검색
				sp.stu_search(list);
				break;
			case 6: //등수처리
				sp.stu_rank(list);
				break;
			case 7: //학생성적정렬
				sp.stu_sort(list);
				break;
			case 8: //파일저장
				sp.stu_save(list);
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}

	}

}
