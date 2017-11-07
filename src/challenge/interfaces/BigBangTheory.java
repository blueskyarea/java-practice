package challenge.interfaces;

public class BigBangTheory {

	public static void main(String[] args) {
		Scientist scientist = new Sheldon() {
			/*search () {
				System.out.println("This is my new spot!");
			}*/
			public void search() {
				System.out.println("This is my new spot!");
			}
		};

		scientist.search();
	}
	
	interface Scientist {
		void search();
	}

	static class Sheldon implements Scientist {
		/*void search() {
			System.out.println("This is my spot.");
		}*/
		public void search() {
			System.out.println("This is my spot.");
		}
	}
}
