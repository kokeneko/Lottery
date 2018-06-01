package lottery;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		int max = 0, position = 0;
		int i;

		Scanner scan = new Scanner(System.in);

		System.out.print("人数を入力:");
		number = scan.nextInt();

		String[] members = new String[number];
		int[]  points = new int[number];

		for (i = 0; i < number; i++) {
			System.out.print(i + 1 + "人目:");
			members[i] = scan.next();

		}
		scan.close();

		Random random = new Random();

		for (i = 0; i < 1000; i++) {
			points[random.nextInt(number)]++;
		}

		for (i = 0; i < number; i++) {
			if (max < points[i]) {
				max = points[i];
				position = i;
			}
		}

		for (i = 0; i < number; i++) {
			System.out.print(members[i] + ";" + points[i1] + " ");
		}
		System.out.println();

		System.out.println("選ばれたのは、" + members[position] + "さんです。");


	}

}
