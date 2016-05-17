package lotto;

public class PrintList {
	
	private MakeNum makenum;

	public PrintList(MakeNum makenum2) {
		makenum = makenum2;///////////////나중에 개념 체크해보기!!!
		
		//makenum = new MakeNum();
		//makenum = makenum2;
	}
	
	
	public void showLottos() {
		// TODO Auto-generated method stub
		/// current 값 받아와서 거기까지만 출력하기
		int [ ][] inslottos =  makenum.getLottos();
		
		for (int y = 1; y < makenum.getCurrent() + 1; y++) {
			System.out.print(y + "번째 : ");
			for (int x = 0; x < inslottos[0].length; x++) {
				System.out.print(inslottos[y][x] + " ");
			}
			System.out.println();
		}
		
	}

}
