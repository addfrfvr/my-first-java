package javaBase;

public class RandomStop {

	public static void main(String[] args) {
		int number=5;
		do{
			int number1=(int) (Math.random() * 6);
			System.out.println(number1);
			if(number==number1) {
				System.out.println("I HIT5...ORZ");
				break;
			}

		}while(number==5);

	}

}
