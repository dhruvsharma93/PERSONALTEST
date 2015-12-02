package com.hw.accountbasics;

import java.util.Scanner;

public class Account {
	private String name;
	private int acno;
	private double mula;

	public Account(String name, int acno, double mula) {
		this.name = name;
		this.acno = acno;
		this.mula = mula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getacno() {
		return acno;
	}

	public void setacno(int acno) {
		this.acno = acno;
	}

	public double getMula() {
		return mula;
	}

	public void setMula(double mula) {
		this.mula = mula;
	}

	public void depo() {
		double newmula;
		System.out.println("Please enter the amount you wish to deposit");
		Scanner in = new Scanner(System.in);
		newmula = in.nextDouble();
		mula = mula + newmula;
		System.out.println("Balance is :" + mula);
	}

	public void wid() {
		double newmula;
		System.out.println("Please enter the amount you wish Withdraw");
		Scanner in = new Scanner(System.in);
		newmula = in.nextDouble();
		if (newmula >= mula) {
			System.out.println("Not enough money to complete transaction");
		} else {
			mula = mula - newmula;// Wid
			System.out.println("Balance is :" + mula);
		}

	}

	public void vew() {
		// Comment is there to commit
		System.out.println("Name 	: " + getName());
		System.out.println("Acc No  : " + getacno());
		System.out.println("Balance : " + getMula());
	}
}
