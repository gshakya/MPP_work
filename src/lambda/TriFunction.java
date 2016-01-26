package lambda;

import java.util.function.BiFunction;

public class TriFunction{
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (x,y) -> x+y;
		System.out.println(f.apply(2, 3));
	}
}
