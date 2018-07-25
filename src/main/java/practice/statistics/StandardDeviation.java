package main.java.practice.statistics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StandardDeviation {
	
	Random rnd = new Random();

	public static void main(String[] args) {
		StandardDeviation sd = new StandardDeviation();
		sd.calc(10);	// 1 - 10
		sd.calc(100);	// 1 - 100
		sd.calc(1000);	// 1 - 1000
	}

	private void calc(int upperNum) {
		List<Integer> rndList = new ArrayList<>();
		Integer sum = 0;
		for (int i = 0; i < 1000; i++) {
			int number = rnd.nextInt(upperNum) + 1;
			sum += number;
			rndList.add(number);
		}
		
		System.out.println("In case of upper number is " + upperNum);
		
		// calc Average
		double ave = (double)sum / 1000;
		BigDecimal bi = new BigDecimal(String.valueOf(ave));
		double roundedAve = bi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("Average:" + roundedAve);
		
		// calc Dispersion
		double dispersion = rndList.stream().mapToDouble(num -> Math.pow(((double)num - roundedAve), 2)).sum() / 1000;
		System.out.println("Dispersion: " + dispersion);
		
		double sum2 = 0.0;
		for(Integer rnd : rndList) {
			sum2 += Math.pow(((double)rnd - roundedAve), 2);
		}
		System.out.println("Dispersion2: " + sum2 / 1000);
		
		// calc StandardDeviation
		double standardDeviation = Math.sqrt(dispersion);
		System.out.println("StandardDeviation: " + standardDeviation);
	}
}
