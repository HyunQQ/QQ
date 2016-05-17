package ExamCollection.object;

public class ObjectCollection {
	private Object[] data;
	private int current;
	private int capacity;// w전체 용량
	private int amount; // 추가 증가량
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
		// 만약에 공간이 모자라면
		if (current >= capacity ) {
			//공간을 늘려준다.
			//1.새로운 크기의 배열을 만드는 거다.
			Object[] temp = new Object[capacity+amount];
			//2. data 배열에 들어있는 객체를 temp배열로 옮겨
			for(int i=0 ; i < capacity; i++)
				temp[i] = data[i];
			//3.기존의 배열은 버려질 필요가 있다. 새로운 배열이 현재 참조되는 배열이 되어야 한다.
			data =temp;
			//4. 늘어난 용량이 새로운 값으로 대치되어야 겠지요?
			capacity +=amount;
		}
		
		this.data[current] = exam;
	}
}
