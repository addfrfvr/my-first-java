package javaBase;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int j = 1; j < 2; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
		

	}

}
