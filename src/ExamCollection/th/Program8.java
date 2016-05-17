package ExamCollection.th;
import java.util.Scanner;

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	//static 
	//static GCollection <Exam> list = new GCollection<Exam>();
	// 복도

	public static void main(String args[]) {
		// 메인메뉴

		
		//GCollection <Integer> list = new GCollection<Integer>();
		GCollection  list = new GCollection();
		
		for(int i= 0 ; i<200 ; i++)
			list.add(i+1);
		
		Thread th =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				print(2,list);
				
			}
		});
		th.start();
		
		print(1,list);
		
	}
	
	private static void print(int key, GCollection list) {
		// TODO Auto-generated method stub
		for(int i =0 ; i<200; i++)
			System.out.println("key :"+key  + "value = " + list.get(i));
		
	}
}