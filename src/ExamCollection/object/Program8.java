package ExamCollection.object;
import java.util.Scanner;

// 공유 데이터 전역화 하기

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	static ObjectCollection list;
	// 복도

	public static void main(String args[]) {
		// 메인메뉴

		list = new ObjectCollection();
		
		//초기화를 ExamCollection 안으로 옮기자
/*		list.exams = new Exam[3];
		list.current = -1;*/
	
		int a =1;
		while (true) {
			switch (inputMenu()) {
			case 1: {
				inputGrade(); /// current는 값변수
				break;
			}
			case 2: {
				getGrade();
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

	private static void getGrade() {
		// TODO Auto-generated method stub
		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  출 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");

		/*for (int i = 0; i < list.current + 1; i++) */
		for(int i=0 ; i<list.size(); i++)
		{
			//Exam exam = list.exams[i];
			
			//	Exam exam = (Exam)list.get(i);
			
			// 범용적인 컬랙션의 단점: 내가 원하는 형태로 바꿔줘야 한다.
			// 형을 바꿀때 그 위치의 값이 내가 생각하는 형이 아닐 수도 있으므로\
			//instancof 를 통해 형을 확인하고 변환을 해주는 작업을 진행해야한다.
			//but!!  이 작업 또한 복잡하고 까다롭다.	
			
			Exam exam = null;
			Object obj= list.get(i);
			if(obj instanceof Exam){
				exam = (Exam)obj;
			}

			int math = exam.getMath();
			int eng = exam.getEng();
			int sci = exam.getSci();

			int total = total(math, eng, sci);// math + eng + sci;
			int total1 = total(exam);///////////////////////////////함수의 오버로드
			float avg = total / 3.0f;

			System.out.printf("\t수학 :%2d\n", math);
			System.out.printf("\t영어 :%2d\n", eng);
			System.out.printf("\t과학 :%2d\n", sci);
			System.out.printf("\t총점 :%2d\n", total);

			System.out.printf("\t총점 :%2d\n", total1);
			System.out.printf("\t평균 :%.2f \n", avg);

			System.out.println("───────────────");
		}
	}

	private static int total(Exam exam) {
		// TODO Auto-generated method stub
		return total(exam.getEng(), exam.getMath(), exam.getSci());
	}

	private static int total(int math, int eng, int sci) {
		// TODO Auto-generated method stub

		return math + eng + sci;
	}

	private static void inputGrade() {
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
		exam.setMath(math);
		exam.setEng(eng);
		exam.setSci(sci);

		list.add(exam);
		/// current 가 3을 넘어가는 순간 에러가 난다.
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