package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적배열사용 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//변수선언부분
		final int STU = 10;
		String[] stuNo = new String[STU];//학번
		String[] name = new String[STU]; //이름
		int[][] score = new int[STU][4]; //국어,영어,수학,합계
		double[] avg = new double[STU];  //평균
		int[] rank = new int[STU];       //등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; //입력된 학생수
		
		//전체화면 출력
		while(true) {
			//화면부분
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("---------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			scan.nextLine(); //enter키 때문
			
			switch(choice) {
			case 1:
				while(true) {
					System.out.println("[ 학생 성적입력 ]");
//					"학번","이름","국어","영어","수학","합계","평균","등수"
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S"+ sdf.format(date) + String.format("%03d", s_count+1);
					// 학번저장
					stuNo[s_count] = stuNo1;
					System.out.println("학생번호 : "+stuNo1);
					// 이름저장
					System.out.println("이름을 입력하세요.>>(0.이전화면 이동) ");
					name[s_count] = scan.nextLine();
					
					if(name[s_count].equals("0")) {
						System.out.println("이전 화면으로 이동합니다.!!");
						System.out.println();
						break;
					}
					
					// 국어,영어,수학 점수 저장
					System.out.println("국어점수를 입력하세요.>> ");
					score[s_count][0] = scan.nextInt();
					System.out.println("영어점수를 입력하세요.>> ");
					score[s_count][1] = scan.nextInt();
					System.out.println("수학점수를 입력하세요.>> ");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					// 합계 저장
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					// 평균 저장
					avg[s_count] = score[s_count][3]/3.0;
					// 입력완료
					System.out.printf("%s 학생성적이 저장되었습니다.\n",name[s_count]);
					System.out.println();
					
					s_count++;
				}
				break;
				
			case 2:
				System.out.println("[ 학생 성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.printf("%s\t",stuNo[i]); //학번
					System.out.printf("%s\t",name[i]);  //이름
					for(int j=0;j<4;j++) {
						System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
					}
					System.out.printf("%.2f\t",avg[i]); //평균
					System.out.printf("%d\t", rank[i]);  //등수
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 학생검색 ]");	
				System.out.println("수정하고자 하는 학생이름을 입력하세요.>>");
				String search = scan.nextLine();
				//검색
				int temp_no = -1; //찾는 학생이 검색된 위치값
				for(int i=0;i<s_count;i++) {
					if(name[i].equals(search)) {
						temp_no = i; //찾는 학생이 검색된 위치값
						System.out.printf("%s 학생이 검색되었습니다.!! \n",search);
						System.out.println();
						break;
					}
				}
				
				// 찾은 학생 성적수정
				if(temp_no==-1) { //찾는 학생이 없을 경우
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!! ");
					System.out.println();
				}else {
					// 학생검색 후 진행
					System.out.printf("          [ %s 성적수정 ] \n",search);
					System.out.println("---------------------------------");
					System.out.println("1.국어점수 수정");
					System.out.println("2.영어점수 수정");
					System.out.println("3.수학점수 수정");
					System.out.println("-----------------------");
					System.out.println("원하는 번호를 입력하세요.>> ");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1: //국어점수 변경 - title : 학번-0 이름-1 국어-2 영어-3 수학-4
						System.out.printf("[ %s점수 수정 ] \n",title[choice+1]);
						//국어점수 - score[temp_no][0]
						System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.printf("변경 %s점수를 입력하세요.>> \n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						// 합계 = 국어점수 + 영어점수 + 수학점수
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						// 평균 = 합계/3.0
						avg[temp_no] = score[temp_no][3]/3.0;
						// 국어점수 : score[temp_no][0]
						System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						break;
					case 2: //영어점수 변경
						System.out.printf("[ %s점수 수정 ] \n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.printf("변경 %s점수를 입력하세요.>> \n",title[choice+1]);
						//영어점수 - score[temp_no][1]
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						break;
					case 3: //수학점수 변경
						System.out.printf("[ %s점수 수정 ] \n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.printf("변경 %s점수를 입력하세요.>> \n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						break;
					}
				}//if
				
				break;
				
			case 4:
				System.out.println("[ 학생검색 ]");
				System.out.println("----------------------------");
				System.out.println("1. 합계점수 검색");
				System.out.println("2. 평균점수 검색");
				System.out.println("3. 학생이름 검색");
				System.out.println("----------------------------");
				System.out.println("원하는 번호를 입력하세요.>> ");
				choice = scan.nextInt();
				scan.nextLine();
				int cnt = 0; //학생을 찾았는지 확인 변수
				switch(choice) {
				
				case 1: //합계점수 검색
					System.out.println("합계점수를 입력하세요.>>");
					int t_score = scan.nextInt();
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					cnt = 0; //학생을 찾았는지 확인 변수
					for(int i=0;i<s_count;i++) {
//						if(name[i].equals(t_name)) {
						if(score[i][3] >= t_score) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					
					break;
				case 2: //평균점수 검색
					System.out.println("평균점수를 입력하세요.>>");
				    double t_avg = scan.nextDouble();
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					cnt = 0; //학생을 찾았는지 확인 변수
					for(int i=0;i<s_count;i++) {
//						if(name[i].equals(t_name)) {
						if(avg[i] >= t_avg) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					
					break;
					
					
					
					
				case 3: //학생이름 검색
					System.out.println("학생이름을 입력하세요.>>");
					String t_name = scan.nextLine();
					
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					cnt = 0; //학생을 찾았는지 확인 변수
					for(int i=0;i<s_count;i++) {
//						if(name[i].equals(t_name)) {
						if(name[i].contains(t_name)) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					break;
				}
				break;
				
			case 5:
				System.out.println("[ 등수처리 ]");
				for(int i=0;i<s_count;i++) {
					int count = 1; //초기화
					for(int j=0;j<s_count;j++) 
						if(score[i][3]<score[j][3]) count++;
					rank[i] = count;
				}
				
				System.out.println("등수처리가 완료되었습니다.!!");
				System.out.println();
				break;
				
			}//switch
			
			
		}//while

	}//main

}//class
