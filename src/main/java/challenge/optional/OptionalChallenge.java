package main.java.challenge.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalChallenge {
	public static void main(String[] args){
		List<String> list = Arrays.asList("X", "Zero", "Sigma", "Willy");
		
		Optional<String> op = list.stream().findFirst();
		Optional<String> op2 = list.stream().filter(e -> e.equals("Signa")).findAny();
		
		System.out.println(op.orElse(""));
		System.out.println(op2.orElse("Double"));
	}
}
