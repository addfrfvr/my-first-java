package javaBase;

import java.util.Scanner;

public class CashCards {
	private String number;
	private int  balance;
	private int bonus;
	
	CashCards(String number, int balance,int bonus){
		this.number=number;
		this.balance=balance;
		this.bonus=bonus;		
	}
	
	void store(int money) {
		if(money>0) {
			this.balance+=money;
			if(money>=1000) {
				this.bonus++;
			}
		}
		else {
			System.out.println("儲值是負的?你是來臭臭的嗎?");
		}
	}
	
	
	int getBalance() {
		return balance;
	}
	
	int getBonus() {
		return bonus;
	}
	
	String getNumber() {
		return number;
	}
	
	void charge(int money) {
		if(money>0) {
			if(money>this.balance) {
				this.balance-=money;
			}
			else {
				System.out.println("錢錢不夠啦!!");
			}
		}
		else {
			System.out.println("扣負數?這不是叫我儲值嗎?");
		}
	}
	int exchange(int bonus) {
		if(bonus>0) {
			this.bonus-=bonus;
		}
		return this.bonus;
		
	}
	
	
	}



