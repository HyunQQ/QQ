package ExamCollection.generic;

import java.util.Scanner;

// ���� ������ ����ȭ �ϱ�

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	// static
	// static GCollection <Exam> list = new GCollection<Exam>();
	// ����

	public static void main(String args[]) {
		// ���θ޴�

		// GCollection <Integer> list = new GCollection<Integer>();
		GCollection list = new GCollection();
		
		for(int i = 0 ; i <200 ; i++)
		{
			list.add(i+1);
		}
		
	}
}