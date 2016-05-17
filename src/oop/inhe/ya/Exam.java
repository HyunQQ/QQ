package oop.inhe.ya;

import java.util.Scanner;

/*
 * 주의 : 이 클래스는 공통 분모이므로 직접사용x
 * 반드시 확장해서 사용하세요.
 * but 공지 읽지 않으니 내가 조절 
 * 그 키워드가  abstract 
 * 이 클래스가 추상 클래스임을 밝혀줌으로써
 * 고쳐 쓰기를 유도
 * */


public abstract class Exam {
	private int math;
	private int eng;
	private int sci;
	private AvgListener avgListener;
	
	
	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}
	public Exam() {
		// TODO Auto-generated constructor stub
		this(0,0,0);
	}
	public Exam(int math , int eng, int sci) {
		// TODO Auto-generated constructor stub
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	/*
	 * public void setMath(int math){ this.math = math; //// this가 없으면 우선순위에 따라
	 * 되기 때문에 오류가 아닌 버그가 이루어 진다. //따라서 매게 변수 자체에 자신의 값을 넣어 값이 바뀌지 않는ㄴ다. }
	 * /////////getter,setter public int getMath(){ return math; }
	 * 
	 * public void setEng( int eng){ //exam = new Exam(); this.eng = eng; }
	 * 
	 * public int getEng(){ return eng; } public void setSci( int sci){ //exam =
	 * new Exam(); this.sci = sci; }
	 * 
	 * public int getSci(){ return sci; }
	 */ ////////// 자동 만들기 오른쪽 클릭, 소스 generater getter setter

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int  total(){
		return math+eng+sci;
	}
	public double avg() {
		// TODO Auto-generated method stub
		//return total()/3;
		return avgListener.avg();
	}
	
	public int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("─────────────────");
		System.out.println("	         성적 관리 프로그램           ");
		System.out.println("	         1. 성적 입력           ");
		System.out.println("	         2. 성적 출력           ");
		System.out.println("	         3. 종료           ");
		System.out.println("─────────────────");
		int menu = scan.nextInt();

		return menu;
	}

}
