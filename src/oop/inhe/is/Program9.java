package oop.inhe.is;

import java.util.Scanner;



// 함수를 이용해 구조만 작성하는 코드 (데이터의 구조화)

public class Program9 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		// 메인메뉴
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
				System.out.println("잘못된 입력입니다.");
			}
			}

		}

		// 1번 성적입력
		// 2번 성적 출력
		// 3번 종료
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}