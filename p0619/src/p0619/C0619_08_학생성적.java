package p0619;

import java.util.Scanner;

public class C0619_08_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//3명 학생 - 국어,영어,수학
		// 학번-stu0001 S,이름-S,국어-i,영어-i,수학-i,합계-i,평균-d,등수-i
		final int STU = 20; //전체 학생수
		String[] stuNo = new String[STU]; //학번
		String[] name = new String[STU];  //이름
		int[][] score = new int[STU][4];  //국어,영어,수학,합계
		double[] avg = new double[STU];   //평균
		int[] rank = new int[STU];        //등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; //입력된 학생수
		
		//----- 프로그램 실행 -----
		Loop1:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt(); // 1  enter키
			scan.nextLine();
			
			switch(choice) {
			case 1:
				
				//입력화면
				while(true) {
					System.out.println("[ 성적입력 ]");
					// 학번 자동부여 - S0001
         			stuNo[s_count] = "S"+String.format("%04d", s_count+1);
         			System.out.println("학생번호 : "+stuNo[s_count]);
         			
         			//이름입력
					System.out.println("이름을 입력하세요.>>(0.취소)");
					String temp = scan.nextLine();
					if(temp.equals("0")) {
						System.out.println("이전 화면으로 이동합니다.!!");
						System.out.println();
						break; //while
					}
					
					//이름입력
					name[s_count] = temp;
					
					//점수입력
					for(int i=0;i<3;i++) {
						System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
						score[s_count][i] = scan.nextInt();
					}
					scan.nextLine();
					
					//합계,평균
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
					
					System.out.printf("학번 : %s, 이름 : %s \n",stuNo[s_count],name[s_count]);
					System.out.println("성적입력이 완료되었습니다.!!");
					System.out.println();
					
					s_count++; //학생수 증가
				}
				
				break; //switch
				
				
			case 2:
				System.out.println("                     [ 성적출력 ]");

				// 학생입력한 데이터출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t%d\t%d\t",score[i][0],score[i][1],score[i][2]);
					System.out.printf("%d\t%.2f\t",score[i][3],avg[i]);
					System.out.printf("%d\n",rank[i]);
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("         [ 학생검색 ]");
				System.out.println("---------------------------------");
				System.out.println("검색하고자 하는 학생 이름을 입력하세요.>> ");
				String search = scan.nextLine();
				
				//검색
				int temp_no = -1;
				for(int i=0;i<s_count;i++) {
					if(name[i].equals(search)) {
						temp_no = i; //찾는 학생이 검색되었을 경우
						System.out.printf("%s 학생이 검색되었습니다.!! \n",search);
						System.out.println();
						break;
					}
				}
				
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
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다!!");
				break Loop1;
			}//switch
		}//while

		
		
		
	}//main

}//class
