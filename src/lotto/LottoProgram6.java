package lotto;

import java.util.Scanner;

public class LottoProgram6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// ���� �޴� �Է�
		MakeNum makenum = new MakeNum();
		PrintList printlist = new PrintList(makenum);

		outwhile: while (true) {
			switch (inputMainMenu()) {
			case 1: {
				// �ζ��ڵ�����
				// ������ ���� �Է�
				makenum.setCurrent(makenum.autoMakeNum(makenum.getLottos(), makenum.getCurrent()));

				break;
			}
			case 2: {
				// �ζ� ���� ����
				// ���� ��ȣ �Է�

				makenum.setCurrent(makenum.inputPrivNum(makenum.getCurrent(), makenum.getLottos()));

				break;
			}
			case 3: {
				/// �ζ� ��� ���
				printlist.showLottos();
				break;
			}
			case 4: {
				// �ý��� ����
				System.out.println("�ý����� �����մϴ�.");
				break outwhile;
			}

			default: {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}

			}
		}
		scan.close();
	}

	//////////////////////// main
	private static int inputMainMenu() {
		// TODO Auto-generated method stub

		int menu;
		System.out.println("��������������������������������");
		System.out.println("             �ζ� ���� �޴�            ");
		System.out.println("��������������������������������");
		System.out.println("            1. ��ȣ �ڵ� ����         ");
		System.out.println("            2. ��ȣ ���� ����         ");
		System.out.println("            3. ��ȣ Ȯ��                ");
		System.out.println("            4. ���α׷� ����          ");
		System.out.println("��������������������������������");
		System.out.println("��ȣ�� �Է��� �ּ���");
		menu = scan.nextInt();

		return menu;
	}

}
