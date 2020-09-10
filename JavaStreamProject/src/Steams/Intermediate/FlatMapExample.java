package Steams.Intermediate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {

//		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//		stream.flatMap(new Function<Integer, Stream<Integer>>() {
//
//			@Override
//			public Stream<Integer> apply(Integer t) {
//				return Stream.of(t * 3); // Stream.of(t) 스트림의 인티저타입
//			}
//		}).forEach(System.out::println);

		OptionalDouble result = Employee.employees().stream().flatMapToDouble(new Function<Employee, DoubleStream>() {
			@Override // P.798
			public DoubleStream apply(Employee t) {
				return DoubleStream.of(t.getIncome()); // DoubleStream.of(t) 더블스트림의 인티저타입
			}
		}).reduce(new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				System.out.println(left + ", " + right);
				return left + right;
			}
		});

		if (result.isPresent())
			System.out.println("result: " + result);
		else
			System.out.println("결과 없음");

//		Employee.employees().stream().flatMap(new Function<Employee, Stream<String>>() {
//			@Override // 이름만 가져오기 때문에 리턴타입 Stream<문자타입>으로
//			public Stream<String> apply(Employee t) {
//				return Stream.of(t.getName());
//			}
//			}).forEach(System.out::println);
//  		}).findFirst().ifPresent(System.out::println);

		Optional<LocalDate> result2 = Employee.employees().stream()
				.flatMap(new Function<Employee, Stream<LocalDate>>() {
					@Override
					public Stream<LocalDate> apply(Employee t) {
						return Stream.of(t.getDateOfBirth());
					}
//		    }).forEach(System.out::println);
			}).reduce(new BinaryOperator<LocalDate>() {// 커스터마이징
					@Override
					public LocalDate apply(LocalDate t, LocalDate u) {
						System.out.println(t + ", " + u);
						return t.isBefore(u) ? u : t;
					}
				}); // reduce는 최종처리문 뒤에 더 이상 걸 수 없음.
		System.out.println("min 값: " + result2.get());
	}
}