package oop.inhe.is;

import java.util.Scanner;



// �Լ��� �̿��� ������ �ۼ��ϴ� �ڵ� (�������� ����ȭ)

public class Program9 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		// ���θ޴�
		Exam exam = new Exam(1,2,3);
		
		
		
		while (true) {


			switch (exam.inputMenu()) {
			case 1: {
				exam.inputGrade();
				break;
			}
			case 2: {
				exam.getGrade();
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
}