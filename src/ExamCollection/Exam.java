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
	 * public void setMath(int math){ this.math = math; //// this�� ������ �켱������ ����
	 * �Ǳ� ������ ������ �ƴ� ���װ� �̷�� ����. //���� �Ű� ���� ��ü�� �ڽ��� ���� �־� ���� �ٲ��� �ʴ¤���. }
	 * /////////getter,setter public int getMath(){ return math; }
	 * 
	 * public void setEng( int eng){ //exam = new Exam(); this.eng = eng; }
	 * 
	 * public int getEng(){ return eng; } public void setSci( int sci){ //exam =
	 * new Exam(); this.sci = sci; }
	 * 
	 * public int getSci(){ return sci; }
	 */ ////////// �ڵ� ����� ������ Ŭ��, �ҽ� generater getter setter

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

		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");

		System.out.printf("\t���� :%2d\n", math);
		System.out.printf("\t���� :%2d\n", eng);
		System.out.printf("\t���� :%2d\n", sci);
		System.out.printf("\t���� :%2d\n", total);
		System.out.printf("\t��� :%.2f \n", avg);

		System.out.println("������������������������������");

	}

	void inputGrade() {
		// TODO Auto-generated method stub
		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");
		// �ѹ� ���� �����ϰ� �˻縦 ����
		Scanner scan = new Scanner(System.in);
		int math;
		int eng;
		int sci;
		do {
			System.out.print("	���� :");
			math = scan.nextInt();

			if (!(0 <= math && math <= 100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		} while (!(0 <= math && math <= 100));

		do {
			System.out.print("	���� :");
			eng = scan.nextInt();

			if (!(0 <= eng && eng <= 100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		} while (!(0 <= eng && eng <= 100));
		do {
			System.out.print("	���� :");
			sci = scan.nextInt();

			if (!(0 <= sci && sci <= 100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		} while (!(0 <= sci && sci <= 100));

		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������");
		System.out.println("	         ���� ���� ���α׷�           ");
		System.out.println("	         1. ���� �Է�           ");
		System.out.println("	         2. ���� ���           ");
		System.out.println("	         3. ����           ");
		System.out.println("����������������������������������");
		int menu = scan.nextInt();

		return menu;
	}

}
*/