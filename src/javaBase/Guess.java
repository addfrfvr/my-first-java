package javaBase;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int number = (int) (Math.random() * 10);
	
		String guess = "-1"; 

		do {
			System.out.print("猜數字(0-9):");
			guess = console.nextLine();
			System.out.println(guess);
		} while (guess != "number");
		System.out.println("猜中了.....XD");

	}

}
