package Steams.Intermediate.terminate;

public class Test {
	String name;
	int score;

	public Test() {

	}

	public Test(String name) {
		this.name = name;
	}

	public Test(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", score=" + score + "]";
	}

}
