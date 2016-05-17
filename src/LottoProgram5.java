
//파일 입출력 코드 포함
//메뉴-- 수동입력 자동입력
// 입력받은 번호를 파일에 저장하고 불러 올 수 있게 

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

		/// lotto 메뉴 intro뜬 다음에 메뉴선택 화면 나오기
		/// 번호 자동생성, 수동입력
		Scanner scan = new Scanner(System.in);
		int[][] lottos = new int[10][6];
		int current = -1; /// 값이 있는지 없는 구별을 편하게 하기 위해서 -1로 시작을 한다.

		while (true) {
			// 컬랙팅 하기 위한 변수들과 함께 저장소 변수 선언

			int menu;
			System.out.println("☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("☆★     로또 메인 메뉴   ☆★");
			System.out.println("☆★    1. 번호 목록        ☆★");
			System.out.println("☆★    2. 번호 읽기        ☆★");
			System.out.println("☆★    3. 번호 저장        ☆★");
			System.out.println("☆★    4. 종료               ☆★");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★");

			System.out.println("번호를 입력해 주세요");
			menu = scan.nextInt();
			outsubmenu: switch (menu) {
			case 1: {
				breakWhile: while (true) {
					System.out.println("---------현재 저장되어 있는 번호-------------");
					if (current + 1 == 0)
						System.out.println("저장되어 있는 번호가 없습니다.");

					/*
					 * for (int y = 0; y < current + 1; y++) {
					 * System.out.print(y + 1 + "번째: "); for (int x = 0; x < 6;
					 * x++) System.out.print(lottos[y][x] + "  ");
					 * System.out.println(); }
					 */
					// int [] lotto = new int[6];

					//////////////////////////////// 2차원 배열 이용하기
					//////////////////////////////// !!!!!!!!!!!!!!!!!!!!!
					for (int i = 0; i < current + 1; i++) {
						int[] lotto = lottos[i]; /// lottos[i행]의 주소를 참조한다.

						System.out.printf("%d : %d %d %d %d %d %d\n", i + 1, lotto[0], lotto[1], lotto[2], lotto[3],
								lotto[4], lotto[5]);
					}
					System.out.println("----------------------------------");
					System.out.println("번호 목록 메뉴 입니다.");
					System.out.println("1. 번호 랜덤 생성");
					System.out.println("2. 번호 입력");
					System.out.println("3. 상위 메뉴");
					System.out.println("번호를 입력해 주세요");

					int submenu = scan.nextInt();
					switch (submenu) {
					case 1: {
						int[] lotto = new int[6];

						/// 랜덤 출력 및 정렬 함수
						randomNum(lotto); 
						
						
						///// 입력 값 출력
						System.out.println("입력된 숫자는 : ");
						for (int i = 0; i < 6; i++)
							System.out.print(+lotto[i] + " , ");
						
						System.out.println();
						System.out.println();

						// 입력된 로또 값을 위의 배열에 저장

						current++;
						for (int i = 0; i < 6; i++)
							lottos[current][i] = lotto[i];

						break;
					}
					case 2: {
						int reinput = -1;
						int[] lotto = new int[6];

						while (reinput != 0) {
							System.out.println("번호 입력 메뉴 입니다.");
							System.out.println("원하는 번호를 입력해주세요(6개)(번호사이에 sp or enter 입력)");
							for (int i = 0; i < lotto.length; i++)
								lotto[i] = scan.nextInt();

							System.out.println("입력한 번호: ");
							for (int i = 0; i < lotto.length; i++)
								System.out.print(lotto[i] + "  ");

							System.out.println();
							System.out.println("재입력하시겠습니까??(예=1, 아니요=0)");
							reinput = scan.nextInt();
						}
						current++;
						for (int i = 0; i < 6; i++)
							lottos[current][i] = lotto[i];
						break;

					}
					case 3: {
						System.out.println("상위메뉴로 나갑니다.");
						break breakWhile;

					}
					default: {
						System.out.println("잘못된 입력입니다.");
					}
					}
				}
				break;
			}

			case 2: {

				System.out.println("번호 읽기 메뉴 입니다.");
				FileInputStream fis = new FileInputStream("res/lotto/lottos.txt");
				// int current1 = fis.read();

				// int[][] lottos = new int[10][6];
				/*
				 * for( int y = 0 ; y<current1 ; y++) { for(int x = 0 ; x<6 ;
				 * x++) { lottos[y][x] = fis.read();
				 * System.out.print(lottos[y][x]+","); } System.out.println(); }
				 */
				//////////////////////////////////// 강사님 코드

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
				System.out.println("번호 저장 메뉴 입니다.");
				FileOutputStream fos = new FileOutputStream("res/lotto/lottos.txt");

				fos.write(current + 1);

				for (int i = 0; i < current + 1; i++) {
					int[] lotto = lottos[i];
					for (int j = 0; j < lotto.length; j++)
						fos.write(lotto[j]);
				}
				fos.close();

				/*
				 * //// 문자로 저장할때 FileOutputStream fos = new
				 * FileOutputStream("res/lotto/lottos.txt"); PrintStream fout =
				 * new PrintStream(fos);
				 * 
				 * for (int i = 0; i < current + 1; i++) { int[] lotto =
				 * lottos[i]; /// lottos[i행]의 주소를 참조한다.
				 * 
				 * fout.printf(" %d %d %d %d %d %d\r\n", lotto[0], lotto[1],
				 * lotto[2], lotto[3], lotto[4], lotto[5]);
				 */ // }
				/*
				 * for (int y = 0; y < current + 1; y++) { fout.print(y + 1 +
				 * "번째: "); for (int x = 0; x < 6; x++) fout.print(lottos[y][x]
				 * + "  "); fout.println(); }
				 */

				// fout.close();
				// fos.close();
				System.out.println("값이 저장되었습니다.");
				break;
			}
			case 4: {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}

			default: {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}

			}

		}

	}
	////랜덤 숫자 뽑기 함수
	private static int[] randomNum(int[] lotto) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		///// 겹치지 않게 랜덤 입력
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
		
		////// 순서 정렬 함수의 값을 리턴
		return sortLotto(lotto);
	}
	
	///순서 정렬 함수
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
