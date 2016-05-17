package ExamCollection;

import java.util.Scanner;

public class Exam {
	 private int math;
	 private int eng;
	 private int sci;

	public Exam() {
		// TODO Auto-generated constructor stub
		//this(0,0,0);
	}
	public Exam(int math , int eng, int sci) {
		// TODO Auto-generated constructor stub
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	/*
	 * public void setMath(int math){ this.math = math; //// this가 없으면 우선순위에 따라
	 * 되기 때문에 오류가 아닌 버그가 이루어 진다. //따라서 매게 변수 자체에 자신의 값을 넣어 값이 바뀌지 않는ㄴ다. }
	 * /////////getter,setter public int getMath(){ return math; }
	 * 
	 * public void setEng( int eng){ //exam = new Exam(); this.eng = eng; }
	 * 
	 * public int getEng(){ return eng; } public void setSci( int sci){ //exam =
	 * new Exam(); this.sci = sci; }
	 * 
	 * public int getSci(){ return sci; }
	 */ ////////// 자동 만들기 오른쪽 클릭, 소스 generater getter setter

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}
	}

	/*void getGrade() {
		// TODO Auto-generated method stub
		int math = this.math;
		int eng = this.eng;
		int sci = this.sci;

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

	void inputGrade() {
		// TODO Auto-generated method stub
		System.out.println("┌───────────────┐");
		System.out.println("│                                          │");
		System.out.println("│             성 적  입 력             │");
		System.out.println("│                                          │");
		System.out.println("└───────────────┘");
		// 한번 먼저 실행하고 검사를 진행
		Scanner scan = new Scanner(System.in);
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

		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	int inputMenu() {
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
*/