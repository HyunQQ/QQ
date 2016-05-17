import java.util.Scanner;

import com.notepubs.app.Exam;

// ���� ������ ����ȭ �ϱ�

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	static ExamCollection list;
	// ����

	public static void main(String args[]) {
		// ���θ޴�

		list = new ExamCollection();
		list.exams = new Exam[3];
		list.current = -1;
		int x = 0;
		int y;

		x += 2;
		y = x + 2;

		while (true) {
			switch (inputMenu()) {
			case 1: {
				inputGrade(); /// current�� ������
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
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			}
		}

		// 1�� �����Է�
		// 2�� ���� ���
		// 3�� ����
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

	private static void getGrade() {
		// TODO Auto-generated method stub
		Exam exam = new Exam();

		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");

		for (int i = 0; i < list.current + 1; i++) {
			exam = list.exams[i];

			int math = exam.math;
			int eng = exam.eng;
			int sci = exam.sci;

			int total = total(math, eng, sci);// math + eng + sci;
			int total1 = total(exam);///////////////////////////////�Լ��� �����ε�
			float avg = total / 3.0f;

			System.out.printf("\t���� :%2d\n", math);
			System.out.printf("\t���� :%2d\n", eng);
			System.out.printf("\t���� :%2d\n", sci);
			System.out.printf("\t���� :%2d\n", total);

			System.out.printf("\t���� :%2d\n", total1);
			System.out.printf("\t��� :%.2f \n", avg);

			System.out.println("������������������������������");
		}
	}

	private static int total(Exam exam) {
		// TODO Auto-generated method stub
		return total(exam.eng, exam.math, exam.sci);
	}

	private static int total(int math, int eng, int sci) {
		// TODO Auto-generated method stub

		return math + eng + sci;
	}

	private static void inputGrade() {
		// TODO Auto-generated method stub
		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");
		// �ѹ� ���� �����ϰ� �˻縦 ����

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

		Exam exam = new Exam();
		exam.math = math;
		exam.eng = eng;
		exam.sci = sci;

		list.exams[++list.current] = exam;
		/// current �� 3�� �Ѿ�� ���� ������ ����.
	}

	private static int inputMenu() {

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