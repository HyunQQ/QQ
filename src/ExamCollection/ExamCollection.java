package ExamCollection;

public class ExamCollection {
	private Exam[] exams;
	private int current;
	private int capacity;// w��ü �뷮
	private int amount; // �߰� ������
//	private int n;

	public ExamCollection() {
		// TODO Auto-generated constructor stub
	//	n = 1;
		amount = 5;
		capacity = 3;
		exams = new Exam[capacity];
		current = -1;
	}

	public int size() {
		// TODO Auto-generated method stub

		return current + 1;
	}

	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}

	public int cur() {
		// TODO Auto-generated method stub
		return current;
	}

	public void add(Exam exam) {
		current++;
		// ���࿡ ������ ���ڶ��
		if (current >= capacity ) {
			//������ �÷��ش�.
			//1.���ο� ũ���� �迭�� ����� �Ŵ�.
			Exam[] temp = new Exam[capacity+amount];
			//2. exams �迭�� ����ִ� ��ü�� temp�迭�� �Ű�
			for(int i=0 ; i < capacity; i++)
				temp[i] = exams[i];
			//3.������ �迭�� ������ �ʿ䰡 �ִ�. ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �Ѵ�.
			exams =temp;
			//4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity +=amount;
		}
		
		this.exams[current] = exam;
	}
}
