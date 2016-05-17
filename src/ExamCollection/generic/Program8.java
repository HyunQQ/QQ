package ExamCollection.generic;

import java.util.Scanner;

// 공유 데이터 전역화 하기

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	// static
	// static GCollection <Exam> list = new GCollection<Exam>();
	// 복도

	public static void main(String args[]) {
		// 메인메뉴

		// GCollection <Integer> list = new GCollection<Integer>();
		GCollection list = new GCollection();
		
		for(int i = 0 ; i <200 ; i++)
		{
			list.add(i+1);
		}
		
	}
}