package ExamCollection.yul;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import ExamCollection.yul.GCollection.Iterator;

public class Program8 {
	static Scanner scan = new Scanner(System.in);
	// static
	// static GCollection <Exam> list = new GCollection<Exam>();
	// ����

	public static void main(String args[]) {

		
		System.out.println("---------------<LIST>------------");
		// ������ �ڷ����� ��Ÿ����.
		List<String> list  = new ArrayList<>();
		
		list.add("hello");
		list.add("ok");
		list.add("hello");
		list.add("ok");
		
		for(String s : list)  // List�� �´� �ڷ����� �Է��� �־�� �Ѵ�.
			System.out.println(s);
	/*	for(int i = 0 ; i< list.size();i++)
			System.out.println(list.get(i));
	*/	
		/* ������ ��� ���
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		 */
		System.out.println("---------------<SET>------------");
		/// �ߺ��� ������ ����� ��Ÿ����.
		Set<String> sets = new HashSet<>(); /// ������ �𸥴�.
		sets.add("hello");
		sets.add("ok");
		sets.add("hello");
		sets.add("ok");
		sets.add("23");
		sets.add("5");
		sets.add("12");
		sets.add("7");
		
		
		for(String s : sets)
			System.out.println(s);
		
		
		Set<String> sett = new TreeSet<>();
		sett.add("hello");
		sett.add("ok");
		sett.add("hello");
		sett.add("ok");
		sett.add("23");
		sett.add("5");
		sett.add("12");
		sett.add("7");
		
		for(String s : sett)
			System.out.println(s);
		
		
		
		
		System.out.println("---------------<MAP>------------");
		
		Map<String,String> m = new HashMap<>();
		m.put("name", "ȫ�浿");
		m.put("addr", "����� ������");
		m.put("name", "������"); ///   ���� ȫ�浿�� ���� ������.
											// TreeMap�̿��� ���� name ȫ�浿�� ���� ������.
		System.out.println(m.get("name"));
		

		System.out.println(m.get("addr"));
		/*// ���θ޴�

		// GCollection <Integer> list = new GCollection<Integer>();
		
		
		GCollection list = new GCollection(); //  �̿� ���� ������ �س����� object������ ������ �Ǿ�
															// �ƹ����̳� �� �� �ְԵȴ�.

		for (int i = 0; i < 200; i++)
			list.add(i); /// �÷��� ��� 1. �ε����� ���� ���� ����

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				print(2, list);

			}
		});
		th.start();

		print(1, list);

*/	}

	private static void print(int key, GCollection list) {
		
		
		
		/*
		 * for(int i =0 ; i<200; i++) System.out.println("key :"+key +
		 * "value = " + list.get(i));
		 */
	/*	int i=0;
		list.clear();
		while (list.hasNext()) /// �ε����� �ڵ����� ����
		{	
			System.out.println(list.next());
			i++;
		}
		System.out.println("i��" +i);*/
		
		
/*		ArrayList a = new ArrayList<>();
		
		Map<String, String> m = new HashMap<>();
		
		Iterator it = list.iterator();
		it.clear();
		while(it.hasNext())
			System.out.println(key+"   "+it.next());*/
	}
}