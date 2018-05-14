package main.java.challenge.polymorphism;

public class PolymorphismChallenge {
	
	public static void main(String[] args) {
		System.out.println(new Chris().getCharacter().getClass().getSimpleName());
	}
	
	abstract static class STARSSoldier {
		public STARSSoldier getCharacter() {
			return new Chris();
		}
	}
	
	static class Chris extends STARSSoldier {
		@Override
		public Chris getCharacter() {
			return new Chris();
		}
	}
}
