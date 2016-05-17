package caosule;

import java.util.Scanner;

public class Exam {
	private int	math;
	private int eng;
	private int sci;
	
	static void setMath(Exam exam, int math){
		exam = new Exam();
		exam.math = math;
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
		Scanner scan =new Scanner(System.in);
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
		Scanner scan = new Scanner(System.in);
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
