import java.util.Scanner;

public class LottoProgram {
	public static void main(String []args){
		Scanner scan = new  Scanner(System.in);
		
		int L[] = new int[6];
		System.out.println("원하는 숫자를 6개 입력해 주세요");
		
		//int c=1;
		int check;
		int checkfinal=0;
		do{
				for(int a = 0; a<6 ; a++){
					
					System.out.println("숫자를 입력해주세요.");	
					L[a] = scan.nextInt();
					System.out.print("입력하신 숫자는 : " + L[a] + "\n");
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
						System.out.println("중복된 숫자가 "+check +"개 있습니다. 다시 입력해 주세요!");
					}	
		}while(checkfinal >= 1);
		
	
		System.out.println("┌──────────────────┐");
		System.out.println("│    ★☆★☆★☆★☆★☆★☆★☆★    │");
		System.out.println("│    ★           L O T T O            ★    │");
		System.out.println("│    ★☆★☆★☆★☆★☆★☆★☆★    │");
		System.out.println("│                                                  │");
		System.out.println("│             Lucky number is :              │");
		System.out.println("│                                                  │");
		 System.out.printf("│%7d%7d%7d%7d%7d%7d         │\n" ,L[0],L[1],L[2],L[3],L[4],L[5]);
		System.out.println("│                                                  │");
		System.out.println("│                 Good luck!                   │");
		System.out.println("│               ┌──────┐             │");
		System.out.println("│               │ │┌──┐  │             │");
		System.out.println("│               │ │└┐─┘  │             │");
		System.out.println("│               │ └┌┘└┐  │             │");
		System.out.println("│               │ │└─┘┘  │             │");
		System.out.println("│               └──────┘             │");
		System.out.println("└──────────────────┘");
		
		
		
	}
	}


