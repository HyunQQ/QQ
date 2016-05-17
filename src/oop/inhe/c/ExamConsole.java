package oop.inhe.c;

import java.util.Scanner;

public abstract class ExamConsole {
	/*Exam exam = new Exam();
	*///// �Ʒ����� ���� �Ŵ�.
	
	private Exam exam;
	
	
	public ExamConsole() {
		//exam = new Exam();    ���� �̿��ߴ� �ڵ������� 
										//	������ ĸ���� ���� ����
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

				exam.setMath(math);
				exam.setEng(eng);
				exam.setSci(sci);
	}
	public void print(){
	
				int math = exam.getMath();
				int eng = exam.getEng();
				int sci = exam.getSci();
				

				System.out.println("����������������������������������");
				System.out.println("��                                          ��");
				System.out.println("��             �� ��  �� ��             ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������");

				System.out.printf("\t���� :%2d\n", math);
				System.out.printf("\t���� :%2d\n", eng);
				System.out.printf("\t���� :%2d\n", sci);
				onPrint(); ////  ĸ���� ���鶧 ���Ƿ� �̿��ڿ� ���� �߰��ǰ� ���� �κп� �߰� ��Ų��.
				System.out.printf("\t���� :%2d\n", exam.total());
				System.out.printf("\t��� :%.2f \n", exam.avg());

				System.out.println("������������������������������");
	}
	protected abstract void onPrint();

}
