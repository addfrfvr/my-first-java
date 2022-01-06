package javaBase;

public class CashApp {
	public static void main(String[] args) {
		CashCards[] cards= {
		new CashCards("A001",500,0),
		new CashCards("A002",300,0),
		new CashCards("A003",1000,1),
		new CashCards("A004",2000,2),
		new CashCards("A005",3000,3)
		
		};
		
				
		for(CashCards card:cards){
			System.out.printf("(%s, %d, %d)%n", card.getNumber(),card.getBalance(),card.getBonus());
		
	}

}
}
