import java.util.Scanner;

public class Program4 {

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
			// ���� �Է��ڵ� �ۼ�

			System.out.println("����������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��             �� ��  �� ��             ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������");
			System.out.println("	1. ���� �Է�");
			System.out.println("	2. ���� ���");
			System.out.println("	3. ����");
			System.out.println("	���� >");

			menu = scan.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("����������������������������������");
				System.out.println("��                                          ��");
				System.out.println("��             �� ��  �� ��             ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������");
			//�ѹ� ���� �����ϰ� �˻縦 ����
				do{
					System.out.print("	���� :");
					math = scan.nextInt();
		
					if(!(0<=math && math<=100))
						System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
				}while(!(0<=math && math<=100));
				
				
				/*
				    System.out.print("	���� :");
					math = scan.nextInt();
					while(!(0<=math && math <=100))
					{
						System.out.println("���� ������ ������ϴ�.");
						math =  scan.nextInt();
					}
				*/
				
				/*
				 * while(true){
						math = scan.nextInt();
						//if(!(0<=math && math<=100))
						if(math<0 || math>100)
							System.out.println("��ȿ�� ������ ���� �ƴմϴ�. 0~100������ ���ڸ� �Է����ּ���");
						else
						{
							System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
							break;
						}
					}
				*/
				
				do{
					System.out.print("	���� :");
					eng = scan.nextInt();
		
					if(!(0<=eng && eng<=100))
						System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
				}while(!(0<=eng && eng<=100));
				do{
					System.out.print("	���� :");
					sci = scan.nextInt();
		
					if(!(0<=sci && sci<=100))
						System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100)");
				}while(!(0<=sci && sci<=100));
		
			}
				break;

			case 2: {
				total = math + eng + sci;
				avg = total / 3.0f;

				System.out.println("����������������������������������");
				System.out.println("��                                          ��");
				System.out.println("��             �� ��  �� ��             ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������");

				System.out.printf("\t���� :%2d\n", math);
				System.out.printf("\t���� :%2d\n", eng);
				System.out.printf("\t���� :%2d\n", sci);
				System.out.printf("\t���� :%2d\n", total);
				System.out.printf("\t��� :%.2f \n", avg);

				System.out.println("������������������������������");
			}
				break;

			case 3: {
				System.out.println("Goooooooooooooooooooood Byeeeeee~~hahaha");
				System.exit(0);
			}
				break;

			default: {
				System.out.println("����� �� �Է��� ���� �ʾҽ��ϴ�. 1~3�� �Է����ּ���.");

			}

			}
		}
	}
}