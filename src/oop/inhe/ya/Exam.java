package oop.inhe.ya;

import java.util.Scanner;

/*
 * ���� : �� Ŭ������ ���� �и��̹Ƿ� �������x
 * �ݵ�� Ȯ���ؼ� ����ϼ���.
 * but ���� ���� ������ ���� ���� 
 * �� Ű���尡  abstract 
 * �� Ŭ������ �߻� Ŭ�������� ���������ν�
 * ���� ���⸦ ����
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
	 * public void setMath(int math){ this.math = math; //// this�� ������ �켱������ ����
	 * �Ǳ� ������ ������ �ƴ� ���װ� �̷�� ����. //���� �Ű� ���� ��ü�� �ڽ��� ���� �־� ���� �ٲ��� �ʴ¤���. }
	 * /////////getter,setter public int getMath(){ return math; }
	 * 
	 * public void setEng( int eng){ //exam = new Exam(); this.eng = eng; }
	 * 
	 * public int getEng(){ return eng; } public void setSci( int sci){ //exam =
	 * new Exam(); this.sci = sci; }
	 * 
	 * public int getSci(){ return sci; }
	 */ ////////// �ڵ� ����� ������ Ŭ��, �ҽ� generater getter setter

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
