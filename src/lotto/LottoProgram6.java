package lotto;

import java.util.Scanner;

public class LottoProgram6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 메인 메뉴 입력
		MakeNum makenum = new MakeNum();
		PrintList printlist = new PrintList(makenum);

		outwhile: while (true) {
			switch (inputMainMenu()) {
			case 1: {
				// 로또자동생성
				// 생성할 개수 입력
				makenum.setCurrent(makenum.autoMakeNum(makenum.getLottos(), makenum.getCurrent()));

				break;
			}
			case 2: {
				// 로또 수동 생성
				// 수동 번호 입력

				makenum.setCurrent(makenum.inputPrivNum(makenum.getCurrent(), makenum.getLottos()));

				break;
			}
			case 3: {
				/// 로또 목록 출력
				printlist.showLottos();
				break;
			}
			case 4: {
				// 시스템 종료
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
		System.out.println("            4. 프로그램 종료          ");
		System.out.println("────────────────");
		System.out.println("번호를 입력해 주세요");
		menu = scan.nextInt();

		return menu;
	}

}
