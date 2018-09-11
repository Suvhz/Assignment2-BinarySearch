package binarySearch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static boolean binarySearch(LinkedList<Integer> array, int x) {
		int left = 0;
		int right = array.size() - 1;
		int mid=0;
		while (left<=right) {
			mid = (right + left) / 2;
			if (array.get(mid) == x) {
				System.out.println("Position of the inputed value: " + mid);
				return true;
			
			} else if (x < array.get(mid)) {
				
				
				right = mid - 1;
			} else {
				
				
				left = mid + 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		int x = 0;

		for (int a = 0; a < 100; a++) {
			int b=random.nextInt(100);
					list.add(b);
		}
		Collections.sort(list);
		System.out.println("ArrayList " + list);
		while (true) {
			System.out.println("Enter the number between 0-100 for binary search");
			x = scan.nextInt();

			if (binarySearch(list, x) == false) {
				System.out.println("Element not found");
			}
			System.out.println("DO you want to continue [Y/N]");
			if (scan.next().equalsIgnoreCase("n")) {
				scan.close();
				break;
			}
		}

	}
}
