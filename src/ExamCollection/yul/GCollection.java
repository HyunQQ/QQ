package ExamCollection.yul;

public class GCollection<T, S>{ //G�� ���ø��� �ǹ�,  ��ü���� �޶����� �κ��� ��������.
								//�ڷ����� ��ü�� �� ���� ������ ������ �����Ѵ�.
	private T[] data; /// ���۳� ��= T 
	private int current;
	private int capacity;// w��ü �뷮
	private int amount; // �߰� ������
//	private int index;

	public GCollection() {
		// TODO Auto-generated constructor stub
	//	n = 1;
		amount = 5;
		capacity = 3;
		data = (T[]) new Object[capacity]; ///  New��� �����ڴ� ������ �� �� ����.
		current = -1;
	//	index = 0 ;
		
	}
	public class Iterator{
		private int index;
		public Iterator() {
			// TODO Auto-generated constructor stub
			index = -1;
		}
		
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<current;
		}

		public T next() {
		
			// TODO Auto-generated method stub
			return data[++index];
		}

		public void clear() {
			// TODO Auto-generated method stub
			index = -1;
		}

	}
	public Iterator iterator(){
		return new Iterator();
	}

	public int size() {
		// TODO Auto-generated method stub

		return current + 1;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		return data[i];
	}

	public int cur() {
		// TODO Auto-generated method stub
		return current;
	}

	public void add(T j) {
		current++;
		// ���࿡ ������ ���ڶ��
		if (current >= capacity ) {
			//������ �÷��ش�.
			//1.���ο� ũ���� �迭�� ����� �Ŵ�.
			T[] temp = (T[]) new Object[capacity+amount];
			//2. data �迭�� ����ִ� ��ü�� temp�迭�� �Ű�
			for(int i=0 ; i < capacity; i++)
				temp[i] = data[i];
			//3.������ �迭�� ������ �ʿ䰡 �ִ�. ���ο� �迭�� ���� �����Ǵ� �迭�� �Ǿ�� �Ѵ�.
			data =temp;
			//4. �þ �뷮�� ���ο� ������ ��ġ�Ǿ�� ������?
			capacity +=amount;
		}
		
		this.data[current] =  j;
	}



}
