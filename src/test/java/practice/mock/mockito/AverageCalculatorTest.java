package test.java.practice.mock.mockito;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;
import main.java.practice.mock.mockito.AverageCalculator;
import main.java.practice.mock.mockito.NumberGenerator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AverageCalculatorTest {
	
	@Mock
	NumberGenerator numberGeneratorMock;
	
	@InjectMocks
	AverageCalculator averageCalculatorMock;

	@Test
	public void test() {
		// given
		given(numberGeneratorMock.generateNumber()).willReturn(50);
		
		// when
		Integer average = averageCalculatorMock.getAverage();
		
		// then
		then(average).isEqualTo(50);
	}

}
