package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach(s -> System.out.println(s));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
