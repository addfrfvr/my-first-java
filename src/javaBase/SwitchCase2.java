package javaBase;

public class SwitchCase2 {

	public static void main(String[] args) {
		int score = 100;
		int quotient = score / 10;
		char level = '\0';

		switch (quotient) {
		case 10:
		case 9:
			level = 'A';

		case 8:
			level = 'B';
			
		case 7:
			level = 'C';
			
		case 6:
			level = 'D';
			
		default:
			level = 'E';

		}
		System.out.printf("得分等級:%c%n", level);
	}

}
