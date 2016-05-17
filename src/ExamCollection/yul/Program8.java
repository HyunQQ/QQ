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
	// 복도

	public static void main(String args[]) {

		
		System.out.println("---------------<LIST>------------");
		// 누적된 자료형을 나타낸다.
		List<String> list  = new ArrayList<>();
		
		list.add("hello");
		list.add("ok");
		list.add("hello");
		list.add("ok");
		
		for(String s : list)  // List에 맞는 자료형을 입력해 주어야 한다.
			System.out.println(s);
	/*	for(int i = 0 ; i< list.size();i++)
			System.out.println(list.get(i));
	*/	
		/* 기존의 사용 방법
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		 */
		System.out.println("---------------<SET>------------");
		/// 중복을 제거한 출력을 나타낸다.
		Set<String> sets = new HashSet<>(); /// 순서를 모른다.
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
		m.put("name", "홍길동");
		m.put("addr", "서울시 마포구");
		m.put("name", "오현규"); ///   앞의 홍길동을 덮어 버린다.
											// TreeMap이여도 앞의 name 홍길동을 덮어 버린다.
		System.out.println(m.get("name"));
		

		System.out.println(m.get("addr"));
		/*// 메인메뉴

		// GCollection <Integer> list = new GCollection<Integer>();
		
		
		GCollection list = new GCollection(); //  이와 같이 선언을 해놓으면 object형으로 선언이 되어
															// 아무값이나 들어갈 수 있게된다.

		for (int i = 0; i < 200; i++)
			list.add(i); /// 컬랙션 방법 1. 인덱스를 내가 직접 지시

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
		while (list.hasNext()) /// 인덱스를 자동으로 관리
		{	
			System.out.println(list.next());
			i++;
		}
		System.out.println("i는" +i);*/
		
		
/*		ArrayList a = new ArrayList<>();
		
		Map<String, String> m = new HashMap<>();
		
		Iterator it = list.iterator();
		it.clear();
		while(it.hasNext())
			System.out.println(key+"   "+it.next());*/
	}
}