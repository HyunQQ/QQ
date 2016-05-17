package ExamCollection.object;
import java.util.Scanner;

// ���� ������ ����ȭ �ϱ�

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	static ObjectCollection list;
	// ����

	public static void main(String args[]) {
		// ���θ޴�

		list = new ObjectCollection();
		
		//�ʱ�ȭ�� ExamCollection ������ �ű���
/*		list.exams = new Exam[3];
		list.current = -1;*/
	
		int a =1;
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
		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");

		/*for (int i = 0; i < list.current + 1; i++) */
		for(int i=0 ; i<list.size(); i++)
		{
			//Exam exam = list.exams[i];
			
			//	Exam exam = (Exam)list.get(i);
			
			// �������� �÷����� ����: ���� ���ϴ� ���·� �ٲ���� �Ѵ�.
			// ���� �ٲܶ� �� ��ġ�� ���� ���� �����ϴ� ���� �ƴ� ���� �����Ƿ�\
			//instancof �� ���� ���� Ȯ���ϰ� ��ȯ�� ���ִ� �۾��� �����ؾ��Ѵ�.
			//but!!  �� �۾� ���� �����ϰ� ��ٷӴ�.	
			
			Exam exam = null;
			Object obj= list.get(i);
			if(obj instanceof Exam){
				exam = (Exam)obj;
			}

			int math = exam.getMath();
			int eng = exam.getEng();
			int sci = exam.getSci();

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
		return total(exam.getEng(), exam.getMath(), exam.getSci());
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
		exam.setMath(math);
		exam.setEng(eng);
		exam.setSci(sci);

		list.add(exam);
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