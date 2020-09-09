package Streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntExample {
	public static void main(String[] args) {
		// 1 ~ 10 까지 정수형 배열.
		// 배열로 부터 스트림을 생성하는 방법.
		// 스트림을 생성하고 filter를 통해서 짝수값만!
		// 최종집계처리는 sum()을 가져오는 코드구현.
		
//		int[] intAry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		IntStream iStream = Arrays.stream(intAry);
//		iStream.filter(value -> value%2 == 0)
//			   .forEach(value -> System.out.println(value));
//		
//		iStream = Arrays.stream(intAry);
//		long cnt = iStream.sum();
//		System.out.println("cnt: " + cnt);
		
//		int[] intAry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		IntStream iStream = Arrays.stream(intAry);
//		iStream.filter(new IntPredicate() {
//			@Override
//			public boolean test(int value) {
//				return value %2 == 0;
//			}
//		}).forEach(new IntConsumer() {
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//
//		});
//
		IntStream.range(1, 10).forEach(s -> System.out.println(s));
		System.out.println("- - rangeClosed - -"); //rangeClosed를 사용하면 1 ~ 10까지 다 볼 수 있다.
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("- - filter - -"); //람다식을 이용한 필터링 
		IntStream.rangeClosed(1, 10).filter(n -> n > 5).forEach(System.out::println);
	}
}
