import java.util.Scanner;

public class Rprogram {
	public static void main(String[]args){
		
		System.out.println("숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		System.out.println(an(n));
		System.out.println(sum(n));
		
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return an(1);   ///  초항
		
		return sum(n-1)+an(n);
	}

	private static int an(int n) {
		// TODO Auto-generated method stub
		return 3+(n-1)*7;
	}

}
