public class HelloGoodbye {
	public static void main(String[] args) {
		String result1=String.format("Hello %s and %s.",args[0],args[1]);
		String result2=String.format("Goodbye %s and %s.",args[1],args[0]);
		System.out.println(result1);
		System.out.println(result2);
	}
}
