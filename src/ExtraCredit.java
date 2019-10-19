
public class ExtraCredit {
	public static final int SIZE = 4;

	public static void main(String[] args) {
		tip();
		tophalf();
		bottomhalf();
		tip();
		body();
		tophalf(); 
	}
	
	//makes the straight tip of needle
	public static void tip() {
		for (int tip = 1; tip <= SIZE; tip++) {
			for (int spaces = 1; spaces <= 3 * SIZE; spaces++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	//creates the triangle shaped part that points upward - used twice
	public static void tophalf() {
		for (int top = SIZE; top >= 1; top--) {
			for (int space = 1; space <= (3 * top) - 3; space++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int dots = SIZE - top; dots >= 1; dots--) {
				System.out.print(":::");
			}
			System.out.print("||");
			for (int dots = SIZE - top; dots >= 1; dots--) {
				System.out.print(":::");
			}
			System.out.println("\\__");
		}
		System.out.print("|");
		for (int quote = 1; quote <= SIZE * 6 ; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	//creates bottom half of the top block
	public static void bottomhalf() {
		for (int bottom = SIZE + 1; bottom > 1; bottom--) {
			for (int space = bottom; space <= SIZE ; space++) {
				System.out.print("  ");
			}
			System.out.print("\\_");
			for (int slashes = 2 * bottom + 1; slashes >= 1; slashes--) {
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	//creates long stretch of the tower
	public static void body() {
		for (int body = SIZE * SIZE; body >= 1; body--) {
			for (int spaces = 2 * SIZE + 1; spaces >= 1; spaces--) {
				System.out.print(" ");
			}
			System.out.println("|%%||%%|");
		}
	}
}

	
	
