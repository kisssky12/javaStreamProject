package Steams.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Steams.Intermediate.Student;

public class CollectionExample {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>(); // 문자열 대표적으로 HashSet.
		setStr.add(new String("최재영")); // 문자열 타입에는 숫자는 못넣음.
		setStr.add(new String("민해주"));
		setStr.add(new String("김상민"));

		Iterator<String> iter = setStr.iterator(); // for(String s:setStr) {} 이렇게 쓰던지 Iterator을 쓰던지.
		while (iter.hasNext()) {
			System.out.println(iter.hasNext());
			break;
		}

		List<Student> students = new ArrayList<>(); // 리스트타입
		students.add(new Student("허성준", 80));
		students.add(new Student("최형준", 90));
		
		List<Student> studentw = new ArrayList<>(); // 리스트타입
		studentw.add(new Student("김다희", 80));
		studentw.add(new Student("김도은", 90));

		List<Student> studentr = new ArrayList<>(); // 리스트타입
		studentr.add(new Student("A", 80));
		studentr.add(new Student("B", 90));
		
		for (Student st : students) {
			System.out.println(st);
			
		}
		Map<String, Integer> map = new HashMap<>(); // key하고 values
		map.put("동광희", 25); // (문자열, 해당되는 값) = 동광희에 해당되는 값은 25.
		map.put("김시무", 26);
		Set<String> key = map.keySet(); // key가 String을 담고 있는 셋 컬렉션.
		Iterator<String> itr = key.iterator();
		while (itr.hasNext()) {
			String k = itr.next(); // 키 값을 가지고.
			System.out.println(map.get(k)); // 벨류 값을 가지고.
			
		}

		Map<String, List<Student>> stMap = new HashMap<>(); //<
		stMap.put("남자", students); // 키값은 스트링, 벨류값은 컬랙션(남자 or 여자)
		stMap.put("여자", studentw); // Map값은 순서없이 들어간다.
		stMap.put("재평가", studentr);
		Set<String> setk = stMap.keySet(); // 키셋메소드.
		for (String s : setk) { //루핑돈다.
			System.out.println(s);
			List<Student> valueList = stMap.get(s); // 맵에서 키에 해당되는 벨류값을 가져옴.
			for (Student st : valueList) { 
				System.out.println(st);
				
			}
		}
	}

}
