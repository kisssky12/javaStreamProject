package Steams.collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

enum Gender { // 대문자는 클래스에서만 쓴다. (열거형에서도 대문자)
	MALE, FEMALE; // Gender타입에서는 값을 이 두개만 받을 수 있음.
}

class Student {
	String name;
	int age;
	Gender gender; // (열거형 데이터 타입에는 우리가 정의한 두가지 중 하나만 사용가능)

	public Student(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

}

public class CollectToListExample {
	public static void main(String[] args) {
		Student s1 = new Student("허성준", 25, Gender.MALE);
		Student s2 = new Student("최형준", 27, Gender.MALE);
		Student s3 = new Student("문선애", 29, Gender.FEMALE);
		List<Student> students = Arrays.asList(s1, s2, s3);

		Collector<Student, ?, List<Student>> collector = Collectors.toList();
		List<Student> newList = students.stream()
				.filter(s -> s.gender == Gender.MALE)
				.collect(collector);
		
		newList.stream().forEach(s -> System.out.println(s.name + ", " + s.age));
		
		//나이가 25살 넘는 사람들.
		Set<Student> set = students.stream()
				.filter(s -> s.age > 26)
				.collect(Collectors.toSet());
		
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.name + ", " + s.age);
		}
		
//		students.stream().filter(new Predicate<Student>() {
//			@Override
//			public boolean test(Student t) {
//				return gender == FEMALE;
//			}
//			
//		}).forEach(Student);
//		System.out.println(s.name + ", " + s.age);
	}
}
