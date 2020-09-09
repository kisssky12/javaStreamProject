package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) {
		String file = "list.txt";
//		String file = "src/streams/StreamExample.java";
		Path path = Paths.get(file); //위치의 값에서 파일을 읽어오겠다.
		try {
			Stream<String> stream = Files.lines(path); //예외처리
			stream.forEach(s -> System.out.println(s));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
