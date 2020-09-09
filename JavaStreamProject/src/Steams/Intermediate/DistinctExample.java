package Steams.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		String[] strAry = { "Hong", "Park", "Choi", "Hong" };
		Stream<String> sStream = Arrays.stream(strAry); //리턴되는 타입을 모르면 마우스를 올려서 이클립스를 이용하라.
//		sStream.distinct().forEach(System.out::println); //distinct는 중복된 값을 처리해준다.
		
		sStream = Arrays.stream(strAry);
//		sStream.sorted().forEach(System.out::println);
		
		Student[] students = {new Student("이화진", 50), //
							  new Student("동광희", 60), //
							  new Student("동광희", 60), //
							  new Student("동광희", 65), //
							  new Student("우청일", 70), //
							  new Student("우청일", 70), //
							  new Student("김도은", 70)};
		
		Stream<Student> tStream = Arrays.stream(students);
//		tStream.distinct().forEach(System.out::println);
//		tStream.sorted().forEach(System.out::println); //comparable을 구현해줘야함!
		tStream.sorted(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) { //오버라이딩 형태를 무너뜨리면 안된다.
				return o2.score - o1.score;
			}
			
		}).forEach(System.out::println);
		}
	}
