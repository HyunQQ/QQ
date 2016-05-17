package oop.inhe.c;

import java.util.Scanner;

public abstract class ExamConsole {
	/*Exam exam = new Exam();
	*///// 아래꺼랑 같은 거다.
	
	private Exam exam;
	
	
	public ExamConsole() {
		//exam = new Exam();    원래 이용했던 코드이지만 
										//	나중의 캡슐을 위해 수정
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void input(){
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

				exam.setMath(math);
				exam.setEng(eng);
				exam.setSci(sci);
	}
	public void print(){
	
				int math = exam.getMath();
				int eng = exam.getEng();
				int sci = exam.getSci();
				

				System.out.println("┌───────────────┐");
				System.out.println("│                                          │");
				System.out.println("│             성 적  출 력             │");
				System.out.println("│                                          │");
				System.out.println("└───────────────┘");

				System.out.printf("\t수학 :%2d\n", math);
				System.out.printf("\t영어 :%2d\n", eng);
				System.out.printf("\t과학 :%2d\n", sci);
				onPrint(); ////  캡슐을 만들때 임의로 이용자에 의해 추가되고 싶은 부분에 추가 시킨다.
				System.out.printf("\t총점 :%2d\n", exam.total());
				System.out.printf("\t평균 :%.2f \n", exam.avg());

				System.out.println("───────────────");
	}
	protected abstract void onPrint();

}
