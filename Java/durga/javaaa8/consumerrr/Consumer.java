package Java.durga.javaaa8.consumerrr;

public class Consumer {

	public static void main(String[] args) {
		java.util.function.Consumer<String> c = s -> System.out.println(s);
		c.accept("Imran");
		c.accept("Sayyed");
	}

}
