import java.util.Scanner;

public class Program2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int math = 0;
		int eng = 0;
		int sci = 0;
		int total = 0;
		float avg = 0;
		int menu = 0;
		/*
		 * math = 70; eng = 80; sci = 30;
		 */
		while (true) {
			// 성적 입력코드 작성

			System.out.println("┌───────────────┐");
			System.out.println("│                                          │");
			System.out.println("│             메 인  메 뉴             │");
			System.out.println("│                                          │");
			System.out.println("└───────────────┘");
			System.out.println("	1. 성적 입력");
			System.out.println("	2. 성적 출력");
			System.out.println("	3. 종료");
			System.out.println("	선택 >");

			menu = scan.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("┌───────────────┐");
				System.out.println("│                                          │");
				System.out.println("│             성 적  입 력             │");
				System.out.println("│                                          │");
				System.out.println("└───────────────┘");
				System.out.print("	수학 :");
				math = scan.nextInt();
				System.out.print("	영어 :");
				eng = scan.nextInt();
				System.out.print("	과학 :");
				sci = scan.nextInt();
				System.out.println("");

			}
				break;

			case 2: {
				total = math + eng + sci;
				avg = total / 3.0f;

				System.out.println("┌───────────────┐");
				System.out.println("│                                          │");
				System.out.println("│             성 적  출 력             │");
				System.out.println("│                                          │");
				System.out.println("└───────────────┘");

				System.out.printf("\t수학 :%2d\n", math);
				System.out.printf("\t영어 :%2d\n", eng);
				System.out.printf("\t과학 :%2d\n", sci);
				System.out.printf("\t총점 :%2d\n", total);
				System.out.printf("\t평균 :%.2f \n", avg);

				System.out.println("───────────────");
			}
				break;

			case 3: {
				System.out.println("Goooooooooooooooooooood Byeeeeee~~hahaha");
				System.exit(0);
			}
				break;

			default: {
				System.out.println("제대로 된 입력을 하지 않았습니다. 1~3을 입력해주세요.");

			}

			}
		}
	}
}