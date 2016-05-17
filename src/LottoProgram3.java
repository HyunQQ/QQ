
//파일 입출력 코드 포함

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram3 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\20160222\\lotto.txt");
		Scanner fscan = new Scanner(fis);
		//fscan.next();
		
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;
		int temp;
		// 숙제 : 중복 검사 입력
		//중복체크 1
		for(int i = 0 ; i<6 ; i++)
			lotto[i] = fscan.nextInt();
		System.out.println();
		System.out.println("확인 출력:");
		for(int i = 0 ; i < lotto.length; i++)
			System.out.print("  "+lotto[i]);
		fscan.close();
		fis.close();
		System.out.println();
		
		//중복체크 2
		int check = 0;
		do {
			check = 0;
			for (int i = 0; i < 6; i++) {
				lotto[i] = rand.nextInt(45) + 1;
				System.out.print(lotto[i] + " ,");
			}
			System.out.println();
			for (int j = 0; j < 5; j++) {
				for (int i = j + 1; i < 6; i++) {
					if (lotto[j] == lotto[i])
						check++;
				}
			}
		} while (check != 0);

		// 정렬하기
		for (int a = 5; a > 0; a--) {
			for (int i = 0; i < a; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}
		for (int a = 0; a < 4; a++) {
			for (int i = 0; i < 5 - a; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}
		FileOutputStream fos  = new  FileOutputStream("C:\\20160222\\lotto.txt");
		PrintStream fout = new  PrintStream(fos);
		for (int i = 0; i < 6; i++){
			System.out.printf("%d  ", lotto[i]);
			fout.printf("%d ",lotto[i]);
			}
		fout.close();
		fos.close();
	}
}
