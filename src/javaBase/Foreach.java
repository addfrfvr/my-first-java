package javaBase;

public class Foreach {

	public static void main(String[] args) {
		String[] pigs= {"小豬1","小豬2","小豬3"};
		
		for(String pigStr:pigs) {
			System.out.println(pigStr);
		}
		
		
		int[] nums= {2,3,4};
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		
		CashCard[] cashCards = {
				new CashCard("小豬1",111,1),
				new CashCard("小豬2",222,2),
				new CashCard("小豬3",333,3)
		};
		
		
		for(CashCard dd:cashCards){
			System.out.println(CashCard.get);
			
		}
	}

}
