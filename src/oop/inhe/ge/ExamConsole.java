package oop.inhe.ge;

import java.util.Scanner;

public abstract class ExamConsole {
	/*
	 * Exam exam = new Exam();
	 */
	//// �Ʒ����� ���� �Ŵ�.

	private Exam exam;
	private TitlePrintListener inputtitlePrintListener;
	private TitlePrintListener outputtitlePrintListener;
	// private PrintListener printListener;

	/*
	 * public void setPrintListener(PrintListener printListener) {
	 * this.printListener = printListener; }
	 */
	public ExamConsole() {
		// exam = new Exam(); ���� �̿��ߴ� �ڵ�������
		// ������ ĸ���� ���� ����
	}

	
	public void setInputtitlePrintListener(TitlePrintListener inputtitlePrintListener) {
		this.inputtitlePrintListener = inputtitlePrintListener;
	}


	public void setOutputtitlePrintListener(TitlePrintListener outputtitlePrintListener) {
		this.outputtitlePrintListener = outputtitlePrintListener;
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

	public void input() {
		// TODO Auto-generated method stub
		if (inputtitlePrintListener != null)
			inputtitlePrintListener.onTitlePrint();
		else {
			System.out.println("����������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��             �� ��  �� ��             ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������");
			// �ѹ� ���� �����ϰ� �˻縦 ����
		}
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

	public void print() {

		int math = exam.getMath();
		int eng = exam.getEng();
		int sci = exam.getSci();

		if (outputtitlePrintListener != null)
			outputtitlePrintListener.onTitlePrint();
		else {
			System.out.println("����������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��             �� ��  �� ��             ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������");
		}
		System.out.printf("\t���� :%2d\n", math);
		System.out.printf("\t���� :%2d\n", eng);
		System.out.printf("\t���� :%2d\n", sci);
		/*
		 * if(printListener != null) printListener.onPrint(); //// �������̽��� ���� ������
		 * �޶�� �׷��� �����?
		 */ 
		onPrint();
		System.out.printf("\t���� :%2d\n", exam.total());
		System.out.printf("\t��� :%.2f \n", exam.avg());

		System.out.println("������������������������������");
	}

	protected abstract void onPrint();

}
