package ExamCollection.object;

public class ObjectCollection {
	private Object[] data;
	private int current;
	private int capacity;// w��ü �뷮
	private int amount; // �߰� ������
//	private int n;

	public ObjectCollection() {
		// TODO Auto-generated constructor stub
	//	n = 1;
		amount = 5;
		capacity = 3;
		data = new Object[capacity];
		current = -1;
	}

	public int size() {
		// TODO Auto-generated method stub

		return current + 1;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return data[i];
	}

	public int cur() {
		// TODO Auto-generated method stub
		return current;
	}

	public void add(Object exam) {
		current++;
		// ���࿡ ������ ���ڶ��
		if (current >= capacity ) {
			//������ �÷��ش�.
			//1.���ο� ũ���� �迭�� ����� �Ŵ�.
			Object[] temp = new Object[capacity+amount];
			//2. data �迭�� ����ִ� ��ü�� temp�迭�� �Ű�
			for(int i=0 ; i < capacity; i++)
				temp[i] = data[i];
			//3.������ �迭�� ������ �ʿ䰡 �ִ�. ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �Ѵ�.
			data =temp;
			//4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity +=amount;
		}
		
		this.data[current] = exam;
	}
}
