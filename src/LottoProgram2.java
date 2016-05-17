import java.util.Random;

public class LottoProgram2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] lotto = new int[6];
		int bonus = 0;
		int temp;
		// ���� : �ߺ� �˻� �Է�
		//�ߺ�üũ 1
		for(int i = 0 ; i <lotto.length ; i++){
			lotto[i] = rand.nextInt(8)+1;			
			for(int check = 0; check<i ; check++)
				if(check==i)
					continue;
				else if(lotto[check]==lotto[i])
				{
					lotto[i] = rand.nextInt(8)+1;
					check=-1;
					continue;
				}
			System.out.print("  "+lotto[i]);
		}

		System.out.println();
		System.out.println("Ȯ�� ���:");
		for(int i = 0 ; i < lotto.length; i++)
			System.out.print("  "+lotto[i]);
		

		System.out.println();
		/*//�ߺ�üũ 2
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
*/
		// �����ϱ�
		for (int a = 5; a > 0; a--) {
			for (int i = 0; i < a; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++)// ���� Ȯ��
			System.out.printf("%d  ", lotto[i]);

		System.out.println();

		for (int a = 0; a < 4; a++) {
			for (int i = 0; i < 5 - a; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < 6; i++)// ���� Ȯ��
			System.out.printf("%d  ", lotto[i]);

	}
}
