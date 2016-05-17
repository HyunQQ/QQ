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
		/// �ڽ̰� ��ڽ��� ��û���� �̷�����Ƿ� �⺻ ������ ���� ���� 
		//���׸��� ���� �� ����� ��ȿ������ �ڵ尡 �ȴ�.
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
		//T���¿� �˸��� ���� Ÿ���� ���� �Ǿ� ���� �ʱ� �����̴�.
	}
	public double avg() {
		// TODO Auto-generated method stub
		//return total()/3;
		return avgListener.avg();
	}
	
	public int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������");
		System.out.println("	         ���� ���� ���α׷�           ");
		System.out.println("	         1. ���� �Է�           ");
		System.out.println("	         2. ���� ���           ");
		System.out.println("	         3. ����           ");
		System.out.println("����������������������������������");
		int menu = scan.nextInt();

		return menu;
	}

}
