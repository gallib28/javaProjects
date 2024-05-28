package Banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter bank id number 10 figures");
		String bankID = scan.next();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter bank holder name");
		String holderName = scan1.next();
		
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("enter balance");
		double balance = scan.nextDouble();
		
		
		
		Bank_Account b1 = new Bank_Account(bankID,balance,holderName);
		System.out.println(b1.toString());	
	
		while (true) {
			System.out.println("choose operation: "+"\n"
								+"1: withdraw"+"\n"
								+"2: deposit "+"\n"
								+"3: balance "+"\n"
								+"4: exit");
			Scanner s = new Scanner(System.in);
			int choise = s.nextInt();
			switch (choise) {
			case 1:
				System.out.println("how much you want to withdraw?");
				Scanner s1 = new Scanner(System.in);
				double amount = s1.nextDouble();
				b1.withdraw(amount);
				break ; 
			case 2:
				System.out.println("how much you want to deposit?");
				Scanner s2 = new Scanner(System.in);
				double amount1 = s2.nextDouble();
				b1.deposit(amount1);
				break ; 
			case 3:
				System.out.println(b1.getBalance()); 
				break ; 
			case 4:
				System.out.println("exiting ... ");
				return ;
			}
		}
	
	
	}

}
