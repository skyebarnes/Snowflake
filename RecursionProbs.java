package pkg;

import java.util.Stack;

public class RecursionProbs {

	public static double sumReciprocals(int n) {
		if (n == 0) {
			return 0;
		}
		return 1.0 / n + sumReciprocals(n - 1);
	}

	public static int productOfEvens(int n) {
		if (n <= 0)
			return 1;

		return n * 2 * productOfEvens(n - 1);
	}

	public static void doubleUp(Stack<Integer> nums) {
		if (nums.isEmpty()) {
			return;
		}
		int n = nums.pop();
		doubleUp(nums);
		nums.push(n);
		nums.push(n);
	}

	public static void countToBy(int n, int m) {
		if (n - m <= 0) {
			System.out.print(n);
			return;
		}
		countToBy(n - m, m);
		System.out.print(", " + n);
	}

	public static int matchingDigits(int a, int b) {
		String first = "" + a;
		String second = "" + b;
		if (first.charAt(first.length() - 1) == second.charAt(second.length() - 1)) {
			if (a < 10 || b < 10)
				return 1;
			a /= 10;
			b /= 10;
			return 1 + matchingDigits(a, b);
		}
		return 0;
	}

	public static void printThis(int n) {
		if (n == 2) {
			System.out.print("**");
			return;
		}
		if (n == 1) {
			System.out.print("*");
			return;
		}
		System.out.print("<");
		printThis(n - 2);
		System.out.print(">");
	}
	
	public static void printNums2(int n) {
		if (n == 1) {
			System.out.print("1");
			return;
		}
		
		if (n == 2) {
			System.out.print("11");
			return;
		}
		
		if (n%2 == 0)
			System.out.print(n/2);
		else
			System.out.print(n/2 + 1);
		
		printNums2(n-2);
		
		if (n%2 == 0)
			System.out.print(n/2);
		else
			System.out.print(n/2 + 1);
	}

	public static void main(String args[]) {
		System.out.println(sumReciprocals(10));
		System.out.println(productOfEvens(4));

		Stack<Integer> nums = new Stack<Integer>();
		nums.push(3);
		nums.push(7);
		nums.push(12);
		nums.push(9);
		doubleUp(nums);
		System.out.println(nums);

		countToBy(34, 5);
		System.out.println();
		countToBy(25, 4);
		System.out.println();

		System.out.println(matchingDigits(1000, 0));
		System.out.println(matchingDigits(298892, 7892));

		printThis(1);
		System.out.println();
		printThis(2);
		System.out.println();
		printThis(3);
		System.out.println();
		printThis(4);
		System.out.println();
		printThis(5);
		System.out.println();
		printThis(6);
		System.out.println();
		printThis(7);
		System.out.println();
		printThis(8);
		System.out.println();
		
		printNums2(1);
		System.out.println();
		printNums2(2);
		System.out.println();
		printNums2(3);
		System.out.println();
		printNums2(4);
		System.out.println();
		printNums2(5);
		System.out.println();
		printNums2(6);
		System.out.println();
		printNums2(7);
		System.out.println();
		printNums2(8);
		System.out.println();
		printNums2(9);
		System.out.println();
		printNums2(10);
		System.out.println();

	}

}
