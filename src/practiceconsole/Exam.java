package practiceconsole;

public class Exam {
	private int math;
	private int eng;
	private int sci;
	
	int total;
	float avg;

	public Exam() {
		// TODO Auto-generated constructor stub
		this(0,0,0);
	}
	public Exam(int math , int eng, int sci) {
		// TODO Auto-generated constructor stub
		this.math = math;
		this.eng = eng;
		this.sci = sci;
		this.total=0;
		this.avg = 0;
	}

	
	
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	public int total(){
		this.total = this.eng+this.math+this.sci;
		return this.total;
	}
	
	public float avg(){
		this.avg = this.total/3;
		return this.avg;
	}



}
