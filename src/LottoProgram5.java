
//���� ����� �ڵ� ����
//�޴�-- �����Է� �ڵ��Է�
// �Է¹��� ��ȣ�� ���Ͽ� �����ϰ� �ҷ� �� �� �ְ� 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram5 {
	public static void main(String[] args) throws IOException {

		/// lotto �޴� intro�� ������ �޴����� ȭ�� ������
		/// ��ȣ �ڵ�����, �����Է�
		Scanner scan = new Scanner(System.in);
		int[][] lottos = new int[10][6];
		int current = -1; /// ���� �ִ��� ���� ������ ���ϰ� �ϱ� ���ؼ� -1�� ������ �Ѵ�.

		while (true) {
			// �÷��� �ϱ� ���� ������� �Բ� ����� ���� ����

			int menu;
			System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
			System.out.println("�١�     �ζ� ���� �޴�   �١�");
			System.out.println("�١�    1. ��ȣ ���        �١�");
			System.out.println("�١�    2. ��ȣ �б�        �١�");
			System.out.println("�١�    3. ��ȣ ����        �١�");
			System.out.println("�١�    4. ����               �١�");
			System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");

			System.out.println("��ȣ�� �Է��� �ּ���");
			menu = scan.nextInt();
			outsubmenu: switch (menu) {
			case 1: {
				breakWhile: while (true) {
					System.out.println("---------���� ����Ǿ� �ִ� ��ȣ-------------");
					if (current + 1 == 0)
						System.out.println("����Ǿ� �ִ� ��ȣ�� �����ϴ�.");

					/*
					 * for (int y = 0; y < current + 1; y++) {
					 * System.out.print(y + 1 + "��°: "); for (int x = 0; x < 6;
					 * x++) System.out.print(lottos[y][x] + "  ");
					 * System.out.println(); }
					 */
					// int [] lotto = new int[6];

					//////////////////////////////// 2���� �迭 �̿��ϱ�
					//////////////////////////////// !!!!!!!!!!!!!!!!!!!!!
					for (int i = 0; i < current + 1; i++) {
						int[] lotto = lottos[i]; /// lottos[i��]�� �ּҸ� �����Ѵ�.

						System.out.printf("%d : %d %d %d %d %d %d\n", i + 1, lotto[0], lotto[1], lotto[2], lotto[3],
								lotto[4], lotto[5]);
					}
					System.out.println("----------------------------------");
					System.out.println("��ȣ ��� �޴� �Դϴ�.");
					System.out.println("1. ��ȣ ���� ����");
					System.out.println("2. ��ȣ �Է�");
					System.out.println("3. ���� �޴�");
					System.out.println("��ȣ�� �Է��� �ּ���");

					int submenu = scan.nextInt();
					switch (submenu) {
					case 1: {
						int[] lotto = new int[6];

						/// ���� ��� �� ���� �Լ�
						randomNum(lotto); 
						
						
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

						break;
					}
					case 2: {
						int reinput = -1;
						int[] lotto = new int[6];

						while (reinput != 0) {
							System.out.println("��ȣ �Է� �޴� �Դϴ�.");
							System.out.println("���ϴ� ��ȣ�� �Է����ּ���(6��)(��ȣ���̿� sp or enter �Է�)");
							for (int i = 0; i < lotto.length; i++)
								lotto[i] = scan.nextInt();

							System.out.println("�Է��� ��ȣ: ");
							for (int i = 0; i < lotto.length; i++)
								System.out.print(lotto[i] + "  ");

							System.out.println();
							System.out.println("���Է��Ͻðڽ��ϱ�??(��=1, �ƴϿ�=0)");
							reinput = scan.nextInt();
						}
						current++;
						for (int i = 0; i < 6; i++)
							lottos[current][i] = lotto[i];
						break;

					}
					case 3: {
						System.out.println("�����޴��� �����ϴ�.");
						break breakWhile;

					}
					default: {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
					}
				}
				break;
			}

			case 2: {

				System.out.println("��ȣ �б� �޴� �Դϴ�.");
				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");
				// int current1 = fis.read();

				// int[][] lottos = new int[10][6];
				/*
				 * for( int y = 0 ; y<current1 ; y++) { for(int x = 0 ; x<6 ;
				 * x++) { lottos[y][x] = fis.read();
				 * System.out.print(lottos[y][x]+","); } System.out.println(); }
				 */
				//////////////////////////////////// ����� �ڵ�

				current = -1;
				int count = fis.read();

				for (int n = 0; n < count; n++) {
					current++;
					int[] lotto = lottos[n];

					for (int i = 0; i < 6; i++)
						lotto[i] = fis.read();

				}

				///////////////////////////
				fis.close();

				break;
			}
			case 3: {
				System.out.println("��ȣ ���� �޴� �Դϴ�.");
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");

				fos.write(current + 1);

				for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					for (int j = 0; j < lotto.length; j++)
						fos.write(lotto[j]);
				}
				fos.close();

				/*
				 * //// ���ڷ� �����Ҷ� FileOutputStream fos = new
				 * FileOutputStream("res/lotto/lottos.txt"); PrintStream fout =
				 * new PrintStream(fos);
				 * 
				 * for (int i = 0; i < current + 1; i++) { int[] lotto =
				 * lottos[i]; /// lottos[i��]�� �ּҸ� �����Ѵ�.
				 * 
				 * fout.printf(" %d %d %d %d %d %d\r\n", lotto[0], lotto[1],
				 * lotto[2], lotto[3], lotto[4], lotto[5]);
				 */ // }
				/*
				 * for (int y = 0; y < current + 1; y++) { fout.print(y + 1 +
				 * "��°: "); for (int x = 0; x < 6; x++) fout.print(lottos[y][x]
				 * + "  "); fout.println(); }
				 */

				// fout.close();
				// fos.close();
				System.out.println("���� ����Ǿ����ϴ�.");
				break;
			}
			case 4: {
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
			}

			default: {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}

			}

		}

	}
	////���� ���� �̱� �Լ�
	private static int[] randomNum(int[] lotto) {
		// TODO Auto-generated method stub
		Random rand = new Random();

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
		
		////// ���� ���� �Լ��� ���� ����
		return sortLotto(lotto);
	}
	
	///���� ���� �Լ�
	private static int[] sortLotto(int[] lotto) {
		// TODO Auto-generated method stub
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
		return lotto;
	}
}
