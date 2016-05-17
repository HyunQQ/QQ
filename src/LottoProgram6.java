import java.util.Random;
import java.util.Scanner;

public class LottoProgram6 {
	static Scanner scan =new Scanner(System.in);
	
	public static void main(String[] args) {

		// 메인 메뉴 입력

		int[][] lottos = new int[10][6];
		int current = -1;
		/*
		 * System.out.println("lottos.lenght" + lottos.length);
		 * System.out.println("lottos[].lenght" + lottos[0].length);
		 */


		outwhile: while (true) {
			switch (inputMainMenu()) {
			case 1: {
				// 로또자동생성
				// 생성할 개수 입력
				current = autoMakeNum(lottos, current);
				
				break;
			}
			case 2: {
				// 로또 수동 생성
				// 수동 번호 입력
				current = inputPrivNum(current, lottos);
				break;
			}
			case 3: {
				///로또 목록 출력
				showLottos(lottos,current);
				break;
			}
			case 4: {
				//시스템 종료
				System.out.println("시스템을 종료합니다.");
				break outwhile;
			}

			default: {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}

			}
		}
		scan.close();
	}

	//////////////////////// main
	private static int inputMainMenu() {
		// TODO Auto-generated method stub


		int menu;
		System.out.println("────────────────");
		System.out.println("             로또 메인 메뉴            ");
		System.out.println("────────────────");
		System.out.println("            1. 번호 자동 생성         ");
		System.out.println("            2. 번호 선택 생성         ");
		System.out.println("            3. 번호 확인                ");
		System.out.println("            3. 프로그램 종료          ");
		System.out.println("────────────────");
		System.out.println("번호를 입력해 주세요");
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
			////// 순서 정렬
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
		}

		
		return current;
	}

	private static int inputLottoCount() {
		// TODO Auto-generated method stub
		System.out.println("몇개를 뽑을지 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	

	/////////////////////////////// case2
	private static int inputPrivNum(int current, int[][]lottos) {
		int reinput = -1;
		int[] lotto = new int[6];
		System.out.println("번호 입력 메뉴 입니다.");
		
		while (reinput != 0) {
			lotto= selectNum(lotto);
			System.out.println("입력한 번호: ");
			for (int i = 0; i < lotto.length; i++)
				System.out.print(lotto[i] + "  ");

			System.out.println();
			System.out.println("재입력하시겠습니까??(예=1, 아니요=0)");
			reinput = scan.nextInt();
		}
		current++;
		
		System.out.println("current="+current);
		for (int i = 0; i < 6; i++)
			lottos[current][i] = lotto[i];
		
		return current;
			
	}

	private static int[] selectNum(int[] lotto) {
		System.out.println("원하는 번호를 입력해주세요(6개)(번호사이에 sp or enter 입력)");
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = scan.nextInt();
		
		return lotto;

	}

	/////////////////case 3/////////
	
	private static void showLottos(int[][] lottos, int current) {
		// TODO Auto-generated method stub
		/// current 값 받아와서 거기까지만 출력하기
		for (int y = 1; y < current + 1; y++) {
			System.out.print(y + "번째 : ");
			for (int x = 0; x < lottos[0].length; x++) {
				System.out.print(lottos[y][x] + " ");
			}
			System.out.println();
		}
		
	}

}
