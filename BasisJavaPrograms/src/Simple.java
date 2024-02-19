
public class Simple {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		Class<Simple> c = Simple.class;
		System.out.println(c.getClassLoader());

		System.out.println(String.class.getClassLoader());

	}

};
