// This program prints the first n integers starting with 1 
// in sequential order
// separated by commas

public class printNums {
	public static void main(String[]  args) {
		writeNums(8);
	}
	public static void writeNums(int n) {
		if (n<1) {
			throw new IllegalArgumentException();
		}
		else if (n==1) {
			System.out.print(1);
		}
		else {
			writeNums(n-1);
			System.out.print(", " +n);
		}
	}
}
