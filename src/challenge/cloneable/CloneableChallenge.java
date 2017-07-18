package challenge.cloneable;

public class CloneableChallenge {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human human17 = new Human("cells");
		Human human18 = (Human) human17.clone();
		System.out.println(human17.equals(human18));
		System.out.println(human17.cell.equals(human18.cell));
		
		human18.modifyCell("cells2");
		System.out.println(human17.cell.equals(human18.cell));
	}
	
	static class Human implements Cloneable {
		Cell cell;
		
		public Human(String cellName) {
			this.cell = new Cell(cellName);
		}
		
		public void modifyCell(String name) {
			this.cell.name = name;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}
	
	static class Cell {
		String name;
		public Cell(String cellName) {
			name = cellName;
		}
	}
}
