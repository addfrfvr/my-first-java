package javaBase;

import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			CashCards card1=new CashCards("A級豬豬",10000,1);
			card1.store(scanner.nextInt());
			
			CashCards card2=new CashCards("B級豬豬",1000,2);
			card2.store(scanner.nextInt());
			
			CashCards card3=new CashCards("C級豬豬",100,3);
			card3.store(scanner.nextInt());
			
			System.out.printf(card1.getNumber()+","+card1.getBalance()+","+card1.getBonus());


	}

}
