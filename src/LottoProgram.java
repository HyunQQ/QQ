import java.util.Scanner;

public class LottoProgram {
	public static void main(String []args){
		Scanner scan = new  Scanner(System.in);
		
		int L[] = new int[6];
		System.out.println("���ϴ� ���ڸ� 6�� �Է��� �ּ���");
		
		//int c=1;
		int check;
		int checkfinal=0;
		do{
				for(int a = 0; a<6 ; a++){
					
					System.out.println("���ڸ� �Է����ּ���.");	
					L[a] = scan.nextInt();
					System.out.print("�Է��Ͻ� ���ڴ� : " + L[a] + "\n");
				}
			
				check=0;
		
				for(int b= 0 ; b<6 ; b++){
					for(int c=b+1; c<6; c++){
							if(L[b] == L[c]){
								check +=1;
							}
						}
					checkfinal= check;
						
					
					}
					if(check >= 1){
						System.out.println("�ߺ��� ���ڰ� "+check +"�� �ֽ��ϴ�. �ٽ� �Է��� �ּ���!");
					}	
		}while(checkfinal >= 1);
		
	
		System.out.println("����������������������������������������");
		System.out.println("��    �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�    ��");
		System.out.println("��    ��           L O T T O            ��    ��");
		System.out.println("��    �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�    ��");
		System.out.println("��                                                  ��");
		System.out.println("��             Lucky number is :              ��");
		System.out.println("��                                                  ��");
		 System.out.printf("��%7d%7d%7d%7d%7d%7d         ��\n" ,L[0],L[1],L[2],L[3],L[4],L[5]);
		System.out.println("��                                                  ��");
		System.out.println("��                 Good luck!                   ��");
		System.out.println("��               ����������������             ��");
		System.out.println("��               �� ����������  ��             ��");
		System.out.println("��               �� ����������  ��             ��");
		System.out.println("��               �� ����������  ��             ��");
		System.out.println("��               �� ����������  ��             ��");
		System.out.println("��               ����������������             ��");
		System.out.println("����������������������������������������");
		
		
		
	}
	}


