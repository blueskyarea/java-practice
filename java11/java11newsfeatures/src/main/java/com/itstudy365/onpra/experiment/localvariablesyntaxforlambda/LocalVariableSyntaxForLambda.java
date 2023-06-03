package com.itstudy365.onpra.experiment.localvariablesyntaxforlambda;

import java.util.List;
import java.util.stream.Collectors;

import lombok.NonNull;

public class LocalVariableSyntaxForLambda {
	public String varKeywordInLambda(List<String> list) {
		return list.stream()
			.map((var x) -> x.toUpperCase())
			.collect(Collectors.joining(", "));
	}
	
	public String varKeywordWithNonnullAnnotation(List<String> list) {
		return list.stream()
			.map((@NonNull var x) -> x.toUpperCase())
			.collect(Collectors.joining(", "));
	}
}
