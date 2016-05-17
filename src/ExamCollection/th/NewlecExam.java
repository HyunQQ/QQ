package ExamCollection.th;


public class NewlecExam extends Exam {

	private int com;
	public NewlecExam() {
		// TODO Auto-generated constructor stub	
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		// setKor(kor);
		super(kor, eng, math);  // 부모클래스의 생성자 사용
		this.com = com;
	}
	
	public int total() {
		return super.total() + com; // 기존의 함수 재사용
	}
	
	
	public double avg() {
		return total() / 4.0;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

}
