package lotto;

public class PrintList {
	
	private MakeNum makenum;

	public PrintList(MakeNum makenum2) {
		makenum = makenum2;///////////////���߿� ���� üũ�غ���!!!
		
		//makenum = new MakeNum();
		//makenum = makenum2;
	}
	
	
	public void showLottos() {
		// TODO Auto-generated method stub
		/// current �� �޾ƿͼ� �ű������ ����ϱ�
		int [ ][] inslottos =  makenum.getLottos();
		
		for (int y = 1; y < makenum.getCurrent() + 1; y++) {
			System.out.print(y + "��° : ");
			for (int x = 0; x < inslottos[0].length; x++) {
				System.out.print(inslottos[y][x] + " ");
			}
			System.out.println();
		}
		
	}

}
