package com.techelevator;

public class Balance {
	private double money;
	private int quarters = 0;
	private int dimes = 0;
	private int nickels = 0;
	private int pennies = 0;

	public double getMoney() {
		return money;
	}

	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public Balance(double money) {
		this.money = money;
	}

	public double moneyIn(double moneyInput) {
		money += moneyInput;
		return money;
	}

	public void displayMoney() {
		System.out.println("Current money is " + money);
	}

	public double moneyOut(double moneyInput) {
		money -= moneyInput;
		return money;
	}

	public void cashOut() {
		if (money >= 0) {
			while (money >= 25) {
				quarters = quarters++;
				money -= 25;
			}
			while (money >= 10) {
				quarters = dimes++;
				money -= 10;
			}
			while (money >= 5) {
				quarters = nickels++;
				money -= 10;
			}
			pennies = (int) money;
		}

	}

}