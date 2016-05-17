package oop.inhe.ge;

import java.util.Scanner;

/*

 * */


public abstract class Exam/*<T>*/ {
	private /*T*/int  math;
	private /*T*/int eng;
	private /*T*/int sci;
	private AvgListener avgListener;
	
	
	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}
	public Exam() {
		// TODO Auto-generated constructor stub
		this(0, 0, 0);
		/*this((T) new  Integer(0) ,(T) new  Integer(0) ,(T) new  Integer(0) );  
		/// 박싱과 언박싱이 엄청나게 이루어지므로 기본 형태의 변수 들을 
		//제네릭을 썼을 때 상당히 비효율적인 코드가 된다.
*/	}
	public Exam(T math , T eng, T sci) {
		// TODO Auto-generated constructor stub
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}


	public T getMath() {
		return math;
	}

	public void setMath(T math) {
		this.math = math;
	}

	public T getEng() {
		return eng;
	}

	public void setEng(T eng) {
		this.eng = eng;
	}

	public T getSci() {
		return sci;
	}

	public void setSci(T sci) {
		this.sci = sci;
	}

	public T  total(){
		return math+eng+sci;
		//T형태에 알맞은 연산 타입이 정의 되어 있지 않기 때문이다.
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
