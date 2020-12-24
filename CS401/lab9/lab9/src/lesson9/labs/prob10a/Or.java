package lesson9.labs.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or o = new Or();
		System.out.println(o.someSimpleIsTrue(list));

	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = list.stream()
			.map(a -> a.flag)
			.reduce((a, b) -> a | b)
			.get();

		return accum;
	}

}
