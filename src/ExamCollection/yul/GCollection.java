package ExamCollection.yul;

public class GCollection<T, S>{ //G는 템플릿을 의미,  전체에서 달라지는 부분을 빵구낸다.
								//자료형은 대체할 수 없기 때문에 구멍을 내야한다.
	private T[] data; /// 구멍난 곳= T 
	private int current;
	private int capacity;// w전체 용량
	private int amount; // 추가 증가량
//	private int index;

	public GCollection() {
		// TODO Auto-generated constructor stub
	//	n = 1;
		amount = 5;
		capacity = 3;
		data = (T[]) new Object[capacity]; ///  New라는 연산자는 구멍을 낼 수 없다.
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
		// 만약에 공간이 모자라면
		if (current >= capacity ) {
			//공간을 늘려준다.
			//1.새로운 크기의 배열을 만드는 거다.
			T[] temp = (T[]) new Object[capacity+amount];
			//2. data 배열에 들어있는 객체를 temp배열로 옮겨
			for(int i=0 ; i < capacity; i++)
				temp[i] = data[i];
			//3.기존의 배열은 버려질 필요가 있다. 새로운 배열이 현재 참조되는 배열이 되어야 한다.
			data =temp;
			//4. 늘어난 용량이 새로운 값으로 대치되어야 겠지요?
			capacity +=amount;
		}
		
		this.data[current] =  j;
	}



}
