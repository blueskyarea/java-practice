package practice.mock.mockito;

public class NumberGenerator {
	public NumberGenerator(){
	}
	
	public Integer generateNumber() {
		return (int)(Math.random() * 100) + 1;
	}
}
