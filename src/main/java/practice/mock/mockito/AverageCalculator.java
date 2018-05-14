package main.java.practice.mock.mockito;

public class AverageCalculator {
	private NumberGenerator numberGenerator = new NumberGenerator();
	
	public AverageCalculator() {
	}
	
	public Integer getAverage() {
		Integer numA = numberGenerator.generateNumber();
		Integer numB = numberGenerator.generateNumber();
		
		return (numA + numB) / 2;
	}
}
