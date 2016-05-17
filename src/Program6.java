import java.util.Scanner;




// 데이터 구조체 다루기

public class Program6 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		// 메인메뉴
		
		System.out.println("배열의 수를 입력해주세요");
		Exam[] exams = new Exam[3]; ////이름표 배열

		exams[0] = new Exam();  /// 이름표의 객체화
		exams[1] = new Exam(); /// 이름표의 객체화
		exams[2] = new Exam(); /// 이름표의 객체화
		int current = -1;

		while (true) {
			switch (inputMenu()) {
			case 1: {
				current = inputGrade(exams, current); ///current는 값변수 
				break;
			}
			case 2: {
				getGrade(exams, current);
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

	private static void getGrade(Exam[] exams, int current) {
		// TODO Auto-generated method stub
		Exam exam = new Exam();

		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  출 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");

		for (int i = 0; i < current + 1; i++) {
			exam = exams[i];

			int math = exam.math;
			int eng = exam.eng;
			int sci = exam.sci;

			int total = math + eng + sci;
			float avg = total / 3.0f;

			System.out.printf("\t수학 :%2d\n", math);
			System.out.printf("\t영어 :%2d\n", eng);
			System.out.printf("\t과학 :%2d\n", sci);
			System.out.printf("\t총점 :%2d\n", total);
			System.out.printf("\t평균 :%.2f \n", avg);

			System.out.println("───────────────");
		}
	}

	private static int inputGrade(Exam[] exams, int current) {
		// TODO Auto-generated method stub
		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  입 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");
		// 한번 먼저 실행하고 검사를 진행

		int math;
		int eng;
		int sci;
		do {
			System.out.print("	수학 :");
			math = scan.nextInt();

			if (!(0 <= math && math <= 100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		} while (!(0 <= math && math <= 100));

		do {
			System.out.print("	영어 :");
			eng = scan.nextInt();

			if (!(0 <= eng && eng <= 100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		} while (!(0 <= eng && eng <= 100));
		do {
			System.out.print("	과학 :");
			sci = scan.nextInt();

			if (!(0 <= sci && sci <= 100))
				System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100)");
		} while (!(0 <= sci && sci <= 100));

		Exam exam = new Exam();
		exam.math = math;
		exam.eng = eng;
		exam.sci = sci;

		exams[++current] = exam;
		/// current 가 3을 넘어가는 순간 에러가 난다.
		return current;
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