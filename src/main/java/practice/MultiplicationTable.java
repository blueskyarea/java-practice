package practice;

public class MultiplicationTable {
	
	private void showHeader() {
		System.out.println("+--------- 掛け算九九表 ---------+");
		System.out.println("|     1  2  3  4  5  6  7  8  9 |");
		System.out.println("|  +----------------------------|");
	}
	
	private void showData() {
		StringBuilder line = new StringBuilder();
		for(int j = 1; j <= 9; j++) {
			line.append("| " + j + "| ");
			for(int i = 1; i <= 9; i++) {
				line.append(String.format("%1$02d", (j * i)) + " ");
			}
			line.append("|");
			System.out.println(line);
			line.delete(0, line.length());
		}
	}
	
	private void showFooter() {
		System.out.println("+--+----------------------------+");
	}

	public static void main(String[] args) {
		
		MultiplicationTable mt = new MultiplicationTable();
		mt.showHeader();
		mt.showData();
		mt.showFooter();
	}

}
