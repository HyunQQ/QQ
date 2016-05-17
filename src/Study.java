import java.util.Scanner;

/*import java.util.Random;*/

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("숫자를 입력해주세요");
			Scanner sc = new Scanner(System.in);
			int input;
			int star=1;
			input = sc.nextInt();
			int input1 = input;
			int input2 = input;
			System.out.println("input값은?" + input);
			
			
			for(int a = input1 ; a>0 ; a--){
				for(int b=1 ; b<input1 ; b++){
				System.out.print("○");
				}
				for(int c =1; c<= star ; c ++){	
					if(c%2==1){
						System.out.print("☆");
					}else{
						System.out.print("★");
					}}
				System.out.println("");
				input1 --;
				star+=2;
				
				if (input1 == 1)
				{
					for(int d = input1 ; d<input2 ; d++){
						for(int e=1 ; e<input1 ; e++){
							System.out.print("○");
							}
						for(int f=1 ; f<=star ; f++){
							if(f%2==1){
								System.out.print("☆");
							}else{
								System.out.print("★");
							}
						}
						System.out.println("");
						input1 ++;
						star -=2;
					}
					
					
				}
			}
		
	}
}
