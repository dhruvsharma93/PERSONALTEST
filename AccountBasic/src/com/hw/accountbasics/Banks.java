package com.hw.accountbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Banks {
	public static int peepal = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		int inp = 0;
		int i = 0;
		char choice = 'a';
		String naam;
		int pata;
		double rokda;
		ArrayList<Account> banklist = new ArrayList<Account>();

		while (i != 1) {

			System.out.println("Welcome to Potato Bank");
			System.out.println("Please select a number next to the options to proceed");
			System.out.println("1: Add an Account");
			System.out.println("2: Delete an Account");
			System.out.println("3: View an Account");
			System.out.println("4: Make a deposit");
			System.out.println("5: Make a withdrawl");
			System.out.println("6: Exit");
			inp = in.nextInt();

			if (inp == 1) {
				System.out.println("Please enter the name of the account holder:");
				naam = in.next();
				System.out.println("\n");
				// THIS PORTION NOT WORKING PROPERLY
				System.out.println("Please enter the new Account number of the account holder:");
				pata = in.nextInt();

				System.out.println("How much money exists in this account?");
				rokda = in.nextDouble();
				System.out.println("Review------>> ");
				System.out.println(" Account Holder Name : "  + naam );
				System.out.println(" Account Number : "  + pata);
				System.out.println(" Amount : "  + rokda);
				
				Account temp = new Account(naam, pata, rokda);
				
				
				banklist.add(temp);
			}

			else if (inp == 2) {
				System.out.println("Please enter the account number you wish to delete");
				inp = in.nextInt();
				int found = 0;
				int x;
				char y;
				for (x = 0; x < banklist.size(); x++) {
					if (banklist.get(x).getacno() == inp) {
						found = 1;
						break;
					}
				}
				if (found == 1) {
					banklist.get(x).vew();
					System.out.println("Are you sure? Y or N");
					y = reader.next().charAt(0);
					if ((y == 'Y') || (y == 'y')) {
						banklist.remove(x);
					}
				} else if (found == 0) {
					System.out.println("not found");
				}

			}

			else if (inp == 3) {
				System.out.println("Please enter the account number you wish to view");
				inp = in.nextInt();
				int x = 0;
				int found = 0;
				for (x = 0; x < banklist.size(); x++) {
					if (banklist.get(x).getacno() == inp) {
						found = 1;
						break;
					}
				}
				if (found == 1) {
					banklist.get(x).vew();
				} else if (found == 0) {
					System.out.println("Error not found");
				}
			}

			else if (inp == 4) {
				System.out.println("Please enter the account number for deposit");
				inp = in.nextInt();
				int x = 0;
				int found = 0;
				for (x = 0; x < banklist.size(); x++) {
					if (banklist.get(x).getacno() == inp) {
						found = 1;
						break;
					}
				}
				if (found == 1) {
					banklist.get(x).depo();
				} else if (found == 0) {
					System.out.println("Error not found");
				}
			}

			else if (inp == 5) {
				System.out.println("Please enter the account number for withdrawl");
				inp = in.nextInt();
				int x = 0;
				int found = 0;
				for (x = 0; x < banklist.size(); x++) {
					if (banklist.get(x).getacno() == inp) {
						found = 1;
						break;
					}
				}
				if (found == 1) {
					banklist.get(x).wid();
				} else if (found == 0) {
					System.out.println("Error not found");
				}
			}

			else if (inp == 6) {
				i = 1;
			}
			inp = 0;
		}
	}
}
