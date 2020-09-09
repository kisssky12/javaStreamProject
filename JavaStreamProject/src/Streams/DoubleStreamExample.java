package Streams;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DoubleStreamExample {
	public static void main(String[] args) {
		double[] dAry = { 2.3, 4.5, 8.3, 5.5, 4.6 };
		// 스트림을 생성하고 5보다 작은 반복요소를 필터하고 합을 구하세요.

//		DoubleStream iStream = Arrays.stream(dAry);
//		iStream.filter(value -> value < 5)
//			   .forEach(value -> System.out.println(value));
		
		double sum = Arrays.stream(dAry).filter(new DoublePredicate() {

			@Override
			public boolean test(double value) {
				return value < 5;
			}
		}).sum();
		System.out.println("sum:" + sum);

		// 스트림 타입의 종류
		LongStream lStream = Arrays.stream(new long[] { 10, 29, 38 });
		IntStream iStream = Arrays.stream(new int[] { 1, 2, 3 });
		DoubleStream dStream = Arrays.stream(new double[] { 1.1, 2.2 });
		
		Stream<Integer> intStream; //데이터타입이 같지는 않음.
		Stream<String> sStream = Arrays.stream(new String[] { "Hong", "Park" });
		Stream<Student> tStream = Arrays.stream(new Student[] { new Student("Word", 100) });
	}
}
