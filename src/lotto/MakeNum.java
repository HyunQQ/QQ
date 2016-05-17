package lotto;

import java.util.Random;
import java.util.Scanner;

public class MakeNum {
	private int[][] lottos;
	private int current ;
	private Scanner scan ;
	
	public MakeNum() {
		lottos = new int[10][6];
		current = -1;
		scan = new Scanner(System.in);
	}
	
	public int[][] getLottos() {
		return lottos;
	}

	public void setLottos(int[][] lottos) {
		this.lottos = lottos;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}



	public int autoMakeNum(int[][] lottos, int current) {
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
	
	public int inputLottoCount() {
		// TODO Auto-generated method stub
		System.out.println("�� ��Ʈ�� ������ �Է����ּ���");
		int input = scan.nextInt();
		return input;
	}
	
	public int inputPrivNum(int current, int[][]lottos) {
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

	public int[] selectNum(int[] lotto) {
		
		System.out.println("���ϴ� ��ȣ�� �Է����ּ���(6��)(��ȣ���̿� sp or enter �Է�)");
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = scan.nextInt();
		
		return lotto;

	}
	
	
}
