import java.util.Random;

public class RandomNumberExample5 {
	public static void main(String[] args) {

		randomInts(50, 1, 50);

	}

	public static void randomInts(int num, int origin, int bound) {
		Random random1 = new Random();

		random1.ints(num, origin, bound).filter(n -> n % 2 != 0).forEach(System.out::println);

	}
}