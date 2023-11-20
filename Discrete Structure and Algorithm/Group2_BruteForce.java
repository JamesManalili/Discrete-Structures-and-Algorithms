import java.util.Scanner;

public class Group2_BruteForce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1. Knapsack " + 
							 "\n2. Selection Sort " + 
							 "\n3. Customer Delivery " + 
							 "\n4. String Matching " + 
							 "\n5. Exit " + "\nEnter Choice: ");
			int choice = 0;
			if (!sc.hasNextInt()) {// k
				sc.next();
				System.out.print("Invalid input, try again [1-5]: ");
			}
			choice = sc.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				knapsack();
				break;
			case 2:
				sorting();
				break;
			case 3:
				CustomerDelivery();
				break;
			case 4:
				StringMatch();
				System.out.println();
				break;
			case 5:
				System.out.println("Program terminated \nAsis, Atienza, Manalili, Tapel");
				System.exit(0);
			default:
				System.out.println("Choice Incorrect Select again: ");
				break;
			}
		}
	}

	public static void knapsack() {
		// [Canned Goods] //[5]
		// [Cooking Oil] // [2.5]
		String[] productNames = { "Canned goods", "Cooking oil", "Noodles", "Soap" };
		double[] weights = { 5, 3, 2.5, 7 };
		// 0, 1, 2, 3
		double[] amounts = { 450, 725, 375, 500 };
		// 0, 1, 2, 3
		Scanner sc = new Scanner(System.in);
		double grossWeight = 0;
		do {
			System.out.print("Enter gross weight: ");

			while (!sc.hasNextDouble()) {
				System.out.print("Please input number, Enter again: ");
				sc.next();
			}
			grossWeight = sc.nextDouble();

			if (grossWeight < 1 || grossWeight > 15) {
				System.out.println("Number must be between 1 and 15.");
			}
		} while (grossWeight < 1 || grossWeight > 15);

		int[] solution = knapsack(weights, amounts, grossWeight);

		double totalAmount = 0;
		for (int i = 0; i < solution.length; i++) {
			if (solution[i] > 0) {
				System.out.println(productNames[i] + " - Weight: " + weights[i]);
				totalAmount += amounts[i];
			}
		}
		System.out.println("Total amount: " + totalAmount + "\n");
	}

	// 10
	public static int[] knapsack(double[] weights, double[] amounts, double grossWeight) {
		// store the maximum value for each weight
		double[][] table = new double[weights.length + 1][(int) (grossWeight + 1)];

		// Fill the table with the maximum value for each weight
		for (int i = 1; i <= weights.length; i++) {// 1
			for (int j = 0; j <= grossWeight; j++) {
				if (weights[i - 1] > j) {// 5
					// The product doesn't fit in the knapsack, so use the previous value
					table[i][j] = table[i - 1][j];// 0,0 - 5

				} else {
					// The product fits in the knapsack, so compare the value of taking it vs. not
					// taking it
					double withProduct = amounts[i - 1] + table[i - 1][(int) (j - weights[i - 1])];
					double withoutProduct = table[i - 1][j];
					if (withProduct > withoutProduct) {
						table[i][j] = withProduct;
					} else {
						table[i][j] = withoutProduct;
					}
				}
			}
		}

		// Extract the solution from the table
		int[] solution = new int[weights.length];
		int i = weights.length;
		int j = (int) grossWeight;
		while (i > 0 && j > 0) {
			if (table[i][j] != table[i - 1][j]) {
				// The product was selected, so add it to the solution
				solution[i - 1] = 1;
				j -= weights[i - 1];
			}
			i--;
		}
		return solution;
	}

	public static void selectionsort(int elements, int[] given) {
		System.out.println();
		// {450,725,375,500}
		// 450,375,725,500
		// 725
		// 500
		for (int i = 0; i < elements - 1; i++) {// i=1//2//3
			int min = given[i];// 450//725//725
			int index = i;// 0//1
			for (int j = i + 1; j < elements; j++) {// 1//2//3//j375//500
				if (given[j] < min) {
					min = given[j];
					index = j;
				}
			}
			given[index] = given[i];
			given[i] = min;

			for (int x = 0; x < elements; x++) {
				System.out.print(given[x] + "| ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("SORTED");
	}

	public static void display(int elements, int[] given) {
		for (int i = 0; i < elements; i++) {
			System.out.print(given[i] + "| ");
		}
		System.out.println();
	}

	public static void sorting() {
		Scanner input = new Scanner(System.in);
		int elements;
		System.out.println("Sort by: \na. Product name \nb. Weight \nc. Amount");
		System.out.print("Enter you want to sort [a-c]: ");
		String sort = input.next();
		while (!check(sort)) {
			System.out.print("Enter again: ");
			sort = input.next();
		}
		double[] weight = { 5, 3, 2.5, 7 };
		int[] amount = { 450, 725, 375, 500 };

		if (sort.equals("a")) {
			StringSel string = new StringSel();
			System.out.println("\nSORTING:");
			string.convert();
		}

		else if (sort.equals("b")) {
			SelectionDouble selectD = new SelectionDouble();
			selectD.doubleSelection(weight);
		}

		else if (sort.equals("c")) {
			System.out.println("SORTING:");
			display(amount.length, amount);
			selectionsort(amount.length, amount);
			display(amount.length, amount);
			System.out.println();
		} else {
			System.out.println("Invalid choice");
		}
	}

	public static boolean check(String letter) {
		if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
			return true;
		} else {
			return false;
		}
	}

	public static String address = "";

	public static void CustomerDelivery() {
		Scanner scanner = new Scanner(System.in);

		// Distance matrix
		int[][] distances = { // P J L M
				{ 0, 300, 150, 200 }, // St. Peter
				{ 150, 0, 200, 300 }, // St. John
				{ 100, 120, 0, 200 }, // Lanao
				{ 200, 200, 100, 0 } };// Maguindanao

		// Prompt user for input
		System.out.print("Enter customer name: ");
		String name = scanner.nextLine();
		System.out.print("Enter address: ");
		// St. Peter 1, Peter Subdivision Culiat Quezon City
		int addressIndex = -1;
		while (addressIndex == -1) {
			address = scanner.nextLine();
			if (address.contains("St. Peter")) {
				addressIndex = 0;
			} else if (address.contains("St. John")) {
				addressIndex = 1;
			} else if (address.contains("Lanao")) {
				addressIndex = 2;
			} else if (address.contains("Magindanao")) {
				addressIndex = 3;
			} else {
				System.out.print("Invalid address, Please enter a valid address: ");
			}
		}

		int sourceIndex = -1;
		String source = "";
		System.out.print("Enter source: ");
		while (sourceIndex == -1) {
			source = scanner.nextLine();
			switch (source) {
			case "St. Peter":
				sourceIndex = 0;
				break;
			case "St. John":
				sourceIndex = 1;
				break;
			case "Lanao":
				sourceIndex = 2;
				break;
			case "Magindanao":
				sourceIndex = 3;
				break;
			default:
				System.out.print("Invalid source, Please enter a valid source ");
			}
		}

		// Display the distance 2 0
		System.out.println(
				name + "'s address is " + distances[sourceIndex][addressIndex] + " km away from " + source + ".\n");
	}

	public static void StringMatch() {
		String[] address = { "Peter", "John", "Lanao", "Maguindanao" };
		String customerAddress = "";
		if (customerAddress.equals("")) {
			System.out.println("Address is Null");
		} else {
			String[] customerAddressWords = customerAddress.split(" ");
			int count = 0;
			// St. Peter 1, Peter Subdivision Culiat Quezon City
			// 0 1 2 3 4 5 6 7
			for (int i = 0; i < customerAddressWords.length; i++) {// 1
				String word = customerAddressWords[i];
				for (int j = 0; j < address.length; j++) {
					if (word.equals(address[j])) {
						// System.out.println("Matching word: " + word);
						count++;
						// System.out.println("Word position: " + (i + 1));
					}
				}
			}

			// St. Peter 1, Peter Subdivision Culiat Quezon City
			// 0 1 2 3 4 5 6 7
			// 1 2 3 4 5 6 7 8
			System.out.println("Number of occurrences: " + count);
			System.out.print("Word Position: ");
			for (int i = 0; i < customerAddressWords.length; i++) {
				String word = customerAddressWords[i];
				for (int j = 0; j < address.length; j++) {
					if (word.equals(address[j])) {
						// System.out.println("Matching word: " + word);
						System.out.print(i + 1 + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
