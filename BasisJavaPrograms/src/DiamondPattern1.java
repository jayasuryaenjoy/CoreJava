
public class DiamondPattern1 {

	public static void main(String[] args) {
		int i, j, rows = 6;
		for (i = 0; i < rows; i++) {
			for (j = rows - i; j >= 0; j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 0; i <= rows - 1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= rows - 1 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
