package main.java.practice.lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTry {

	public static void main(String[] args) {
		// example1
		Supplier<String> supplier = () -> new String("abc");
		String moji = supplier.get();
		System.out.println(moji);
		
		// example2
		Supplier<LocalDateTime> getNow = () -> LocalDateTime.now();
		LocalDateTime now = getNow.get();
		System.out.println(now);
		
		// example3
		Supplier<String> supplier2 = () -> "Supplierを実行しました";
		System.out.println(supplier2.get());
	}

}
