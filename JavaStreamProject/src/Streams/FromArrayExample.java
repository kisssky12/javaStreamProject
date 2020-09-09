package Streams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromArrayExample {
	public static void main(String[] args) {

		//람다식
		int[] intAry = { 3, 6, 4, 9, 7 };
		IntStream iStream = Arrays.stream(intAry);
		iStream.filter(value -> value > 5) //
			   .forEach(value -> System.out.println(value));
		
		iStream = Arrays.stream(intAry); //반복자를 다시 생성해줘야함
//		long cnt = iStream.count();
		long cnt = iStream.sum();
		System.out.println("cnt: " + cnt);
		
		iStream = Arrays.stream(intAry, 0, 4); //0~4까지 숫자를 가져옴
		cnt = iStream.peek(t -> System.out.println(t)).count(); //peek중간처리출력 /forEach는 최종처리출력
		cnt = iStream.sum();
		System.out.println("cnt: " + cnt);
	}
}

//		IntStream iStream = Arrays.stream(intAry);
//		iStream.filter(new IntPredicate() {
//			@Override
//			public boolean test(int value) {
//
//				return value > 5;
//			}
//
//		}).forEach(new IntConsumer() { //최종메소드
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//
//		});
//	}
//}
