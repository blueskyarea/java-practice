package com.itstudy365.onpra.experiment.notpredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethod {
	protected List<String> notPredicateMethod(List<String> stringList) {
		return stringList.stream()
			.filter(Predicate.not(String::isBlank))
			.collect(Collectors.toList());
	}
}
