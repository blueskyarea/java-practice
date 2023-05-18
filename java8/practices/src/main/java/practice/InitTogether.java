package practice;

public class InitTogether {

	private String strA, strB, strC;
	private int intA, intB, intC;
	private Entity entA, entB, entC;

	public static void main(String[] args) {
		new InitTogether().start();
	}

	public void start() {
		strA = strB = strC = "hoge";
		strA = "hogeA";
		strB = "hogeB";
		strC = "hogeC";
		System.out.println("strA:" + strA + " strB:" + strB + " strC:" + strC);
		
		intA = intB = intC = 0;
		intA = 1;
		intB = 2;
		intC = 3;
		System.out.println("intA:" + intA + " intB:" + intB + " intC:" + intC);

		entA = entB = entC = new Entity("var");
		entA.name = "varA";
		entB.name = "varB";
		entC.name = "varC";
		System.out.println("entA:" + entA.name + " entB:" + entB.name + " entC:" + entC.name);
	}

	class Entity {
		public String name;

		public Entity(String name) {
			this.name = name;
		}
	}
}
