
public class ExtraCredit {

	public static void main(String[] args) {
		tip();
		line();
		top();
	/*	line();
		bottom();
		line();
		smoke(); */
	}
	//will print the line of = and * printed multiple times in rocket - works
	public static void line() {
		System.out.print("+");
		for (int x = 1; x <= 6; x++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	//creates tip of rocket - works
	public static void tip() {
		for (int i = 1; i <= 5; i ++) {
			for (int space = 5; space >= i; space--) {		//prints out spaces
				System.out.print(" ");
			}
			for (int fslash = 1; fslash <= i; fslash++) {	//prints out forward slashes
				System.out.print("/");
			}
			System.out.print("**");							//prints out stars in middle
			for (int bslash = 1; bslash <= i; bslash++) {	//prints out backslashes
				System.out.print("\\");
			}
			System.out.println("");
		}
	}
	//creats top half of rocket
	public static void top() {
		for (y = 1; y <= 6; y++) {
			System.out.print("|");;
			for (dot = 2; dot >= 1; dot--) {
				System.out.print(".");
			}
		}
	}
	
	
