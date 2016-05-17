import java.util.Scanner;

import com.notepubs.app.Exam;

// 함수를 이용해 구조만 작성하는 코드 (데이터의 구조화)

public class Program5 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		// 메인메뉴
		Exam exam = new Exam();

	
		while (true) {


			switch (inputMenu()) {
			case 1: {
				inputGrade(exam);
				break;
			}
			case 2: {
				getGrade(exam);
				break;
			}
			case 3: {
				exitProgram();
				break;

			}
			default: {
				System.out.println("잘못된 입력입니다.");
			}
			}

		}

		// 1번 성적입력
		// 2번 성적 출력
		// 3번 종료
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	private static void getGrade(Exam exam) {
		// TODO Auto-generated method stub
		int math = exam.math;
		int eng =exam.eng;
		int sci = exam.sci;
		
		int total = math + eng + sci;
		float avg = total / 3.0f;

		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  출 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");

		System.out.printf("\t수학 :%2d\n", math);
		System.out.printf("\t영어 :%2d\n", eng);
		System.out.printf("\t과학 :%2d\n", sci);
		System.out.printf("\t총점 :%2d\n", total);
		System.out.printf("\t평균 :%.2f \n", avg);

		System.out.println("───────────────");

	}

	private static void inputGrade(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  입 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");
	//한번 먼저 실행하고 검사를 진행
		
		int math;
		int eng;
		int sci;
		do{
			System.out.print("	수학 :");
			math = scan.nextInt();

			if(!(0<=math && math<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}while(!(0<=math && math<=100));
		
			
		do{
			System.out.print("	영어 :");
			eng = scan.nextInt();

			if(!(0<=eng && eng<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}while(!(0<=eng && eng<=100));
		do{
			System.out.print("	과학 :");
			sci = scan.nextInt();

			if(!(0<=sci && sci<=100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		}while(!(0<=sci && sci<=100));

		exam.math=math;
		exam.eng=eng;
		exam.sci=sci;
	}
	
	private static int inputMenu() {
		
		System.out.println("─────────────────");
		System.out.println("	         성적 관리 프로그램           ");
		System.out.println("	         1. 성적 입력           ");
		System.out.println("	         2. 성적 출력           ");
		System.out.println("	         3. 종료           ");
		System.out.println("─────────────────");
		int menu = scan.nextInt();
		
		return menu;
	}
}