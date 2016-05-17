import java.util.Random;
import java.util.Scanner;

public class LottoProgram6 {
	static Scanner scan =new Scanner(System.in);
	
	public static void main(String[] args) {

		// ���� �޴� �Է�

		int[][] lottos = new int[10][6];
		int current = -1;
		/*
		 * System.out.println("lottos.lenght" + lottos.length);
		 * System.out.println("lottos[].lenght" + lottos[0].length);
		 */


		outwhile: while (true) {
			switch (inputMainMenu()) {
			case 1: {
				// �ζ��ڵ�����
				// ������ ���� �Է�
				current = autoMakeNum(lottos, current);
				
				break;
			}
			case 2: {
				// �ζ� ���� ����
				// ���� ��ȣ �Է�
				current = inputPrivNum(current, lottos);
				break;
			}
			case 3: {
				///�ζ� ��� ���
				showLottos(lottos,current);
				break;
			}
			case 4: {
				//�ý��� ����
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
		System.out.println("            3. ���α׷� ����          ");
		System.out.println("��������������������������������");
		System.out.println("��ȣ�� �Է��� �ּ���");
		menu = scan.nextInt();

		return menu;
	}

	/////////////////////////////// case1
	private static int autoMakeNum(int[][] lottos, int current) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int getnum = inputLottoCount();
		current++;
		for (int count = 0; count < getnum; count++) {
			int[] lotto = new int[6];
			///// ��ġ�� �ʰ� ���� �Է�
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rand.nextInt(46) + 1;
				for (int check = 0; check < i; check++)
					if (check == i)
						continue;
					else if (lotto[check] == lotto[i]) {
						lotto[i] = rand.nextInt(8) + 1;
						check = -1;
						continue;
					}
			}
			////// ���� ����
			int temp;
			for (int a = 5; a > 0; a--) {
				for (int i = 0; i < a; i++) {
					if (lotto[i] > lotto[i + 1]) {
						temp = lotto[i];
						lotto[i] = lotto[i + 1];
						lotto[i + 1] = temp;
					}
				}
			}
			///// �Է� �� ���
			System.out.println("�Էµ� ���ڴ� : ");
			for (int i = 0; i < 6; i++)
				System.out.print(+lotto[i] + " , ");

			System.out.println();
			System.out.println();

			// �Էµ� �ζ� ���� ���� �迭�� ����

			current++;
			for (int i = 0; i < 6; i++)
				lottos[current][i] = lotto[i];
		}

		
		return current;
	}

	private static int inputLottoCount() {
		// TODO Auto-generated method stub
		System.out.println("��� ������ �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	

	/////////////////////////////// case2
	private static int inputPrivNum(int current, int[][]lottos) {
		int reinput = -1;
		int[] lotto = new int[6];
		System.out.println("��ȣ �Է� �޴� �Դϴ�.");
		
		while (reinput != 0) {
			lotto= selectNum(lotto);
			System.out.println("�Է��� ��ȣ: ");
			for (int i = 0; i < lotto.length; i++)
				System.out.print(lotto[i] + "  ");

			System.out.println();
			System.out.println("���Է��Ͻðڽ��ϱ�??(��=1, �ƴϿ�=0)");
			reinput = scan.nextInt();
		}
		current++;
		
		System.out.println("current="+current);
		for (int i = 0; i < 6; i++)
			lottos[current][i] = lotto[i];
		
		return current;
			
	}

	private static int[] selectNum(int[] lotto) {
		System.out.println("���ϴ� ��ȣ�� �Է����ּ���(6��)(��ȣ���̿� sp or enter �Է�)");
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = scan.nextInt();
		
		return lotto;

	}

	/////////////////case 3/////////
	
	private static void showLottos(int[][] lottos, int current) {
		// TODO Auto-generated method stub
		/// current �� �޾ƿͼ� �ű������ ����ϱ�
		for (int y = 1; y < current + 1; y++) {
			System.out.print(y + "��° : ");
			for (int x = 0; x < lottos[0].length; x++) {
				System.out.print(lottos[y][x] + " ");
			}
			System.out.println();
		}
		
	}

}
