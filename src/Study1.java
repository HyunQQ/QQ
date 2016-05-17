import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원하는 숫자를 입력해 주세요.");
		Scanner scan =  new Scanner(System.in);
		int input = scan.nextInt();
		if(input<11){
			System.out.println("10보다 큰 숫자를 입력해주세요!");
			input = scan.nextInt();
		}
		int circle;
		int star;
		circle = (input-2)/3;
		int circle1 = circle;
		int circle2 = circle;
		int circle3 = circle;
		int star1=1;
		for(int a=0 ; a<circle-1 ; a++){
			for(int b=0; b<circle1;b++){
				System.out.print("○");
			}
			for(int c=0 ; c<star1; c++){
				System.out.print("★");
			}
			for(int d=0; d<circle2;d++){
				System.out.print("○");
			}
			for(int c=0 ; c<star1; c++){
				System.out.print("★");
			}
			for(int b=0; b<circle3;b++){
				System.out.print("○");
			}
			System.out.println("");
			circle1 --;
			circle2 -=2;
			circle3 --;
			star1 +=2;
		}
		int ai=1;
		int bi=(input-2-(2*ai));

		for(int a=1;a<input -circle ;a++){
			for(int b=0;b<a+1;b++){
				System.out.print("○");
			}
			for(int b=bi ; b>0 ; b--){
				System.out.print("★");
			}
			for(int b=0;b<a;b++){
				System.out.print("○");
			}

			bi-=2;
			System.out.println("");
		}
		
	}

}
