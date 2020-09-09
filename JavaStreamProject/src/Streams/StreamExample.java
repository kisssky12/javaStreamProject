package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 컬렉션 => 외부반복자 //Array.
		List<String> users = Arrays.asList("홍길동", "최재영", "민해주", "김상민");
		System.out.println("외부반복자 사용");
		Iterator<String> iter = users.iterator(); // 반복자를 가져오는 작업(iterator)
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str.toString());
		}
		// 스트림 => 내부반복자
		System.out.println("내부반복자 사용");
		Stream<String> streams = users.stream();
		
//		streams.forEach(String t) -> System.out.println(t.toString()); //람다표현식도 가능 (밑에꺼는 다 삭제)
		
		streams.forEach(new Consumer<String>() { // Consumer타입의 익명개체를 구현하겠다.
				//forEach는 스트림의 요소를 처리하는 역할
			@Override
			public void accept(String t) { // Consumer는 accept과 같이 온다.
				System.out.println(t.toString());
			}
		});
	}
}