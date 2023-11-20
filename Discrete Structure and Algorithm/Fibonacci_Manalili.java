import java.util.Scanner;

public class Fibonacci_Manalili {
	static int n1 = 0, n2 = 1, n3 = 0;

	// recursion method
	static void Recursion(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			Recursion(count - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter number of term: ");
		count = sc.nextInt();
		System.out.print("Enter 1st number: ");
		n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		n2 = sc.nextInt();
		while (!check(n1, n2)) {// check the input if n1 is greater than n2
			System.out.print("Enter 1st number: ");
			n1 = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			n2 = sc.nextInt();
		}
		System.out.print("A. Non Recursive \nB. Recursive \nEnter Choice [A-B]: ");
		String choice = sc.next();
		if (choice.equals("A")) {// non recursive
			System.out.print("Fibonnaci= " + n1 + " " + n2);
			for (int i = 0; i < count - 2; ++i) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		} else if (choice.equals("B")) { // recursive
			System.out.print("Fibonacci= " + n1 + " " + n2);
			Recursion(count - 2);
		} else {
			System.out.println("Manalili, James");
		}
	}

	// checker if n1 is >= to n2 it will going to accept
	public static boolean check(int n1, int n2) {
		if (n1 >= n2) {
			System.out.println("1st number must be greater than the 2nd number");
			return false;
		} else {
			return true;
		}
	}
}
