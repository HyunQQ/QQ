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

	private static void inputGrade(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("����������������������������������");
		System.out.println("��                                          ��");
		System.out.println("��             �� ��  �� ��             ��");
		System.out.println("��                                          ��");
		System.out.println("����������������������������������");
	//�ѹ� ���� �����ϰ� �˻縦 ����
		Scanner scan =new Scanner(System.in);
		int math;
		int eng;
		int sci;
		do{
			System.out.print("	���� :");
			math = scan.nextInt();

			if(!(0<=math && math<=100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		}while(!(0<=math && math<=100));
		
			
		do{
			System.out.print("	���� :");
			eng = scan.nextInt();

			if(!(0<=eng && eng<=100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		}while(!(0<=eng && eng<=100));
		do{
			System.out.print("	���� :");
			sci = scan.nextInt();

			if(!(0<=sci && sci<=100))
				System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
		}while(!(0<=sci && sci<=100));

		exam.math=math;
		exam.eng=eng;
		exam.sci=sci;
	}
	
	private static int inputMenu() {
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
