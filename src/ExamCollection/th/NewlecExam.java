package ExamCollection.th;


public class NewlecExam extends Exam {

	private int com;
	public NewlecExam() {
		// TODO Auto-generated constructor stub	
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		// setKor(kor);
		super(kor, eng, math);  // �θ�Ŭ������ ������ ���
		this.com = com;
	}
	
	public int total() {
		return super.total() + com; // ������ �Լ� ����
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
