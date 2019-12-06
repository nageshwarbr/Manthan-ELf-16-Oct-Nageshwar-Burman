package com.manthan.usecase.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.manthan.usecase.bean.ItemBean;

public class Homepage {

	public  void home() {
		Scanner scan=new Scanner(System.in);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to show all food items");
		System.out.println("press 2 to take order from customer");
		System.out.println("press 3 to operte on food item");
		System.out.println("press 4 to display total bill");
		int input=sc.nextInt();
		
		if(input==1) {
			ShowAll showAll=new ShowAll();
			showAll.showAllItems();
			System.err.println("Press 5 to exit and any other digit to repeat");
		}
		else if(input==2) {
			List<ItemBean> ls=new ArrayList<ItemBean>();
			
			Takeorder takeorder=new Takeorder();
			do{
				ls.add(takeorder.takeOrder());
				System.err.println("Press 1 to enter next item and 0 to display bill");
				
			}while(sc.nextInt()!=0);
			double total=0;
			for(ItemBean i:ls) {
				total+=i.getPrice();
			}
			System.out.println("Total bill is = "+total);
			System.err.println("Press 5 to exit and any other digit to repeat");
		}
		else if(input==3) {
			System.out.println("press A to add food item");
			System.out.println("Press B to remove food item");
			System.out.println("press C to modify food item");

			String ch=sc.next();
			if(ch.equals("A")) {
				Operate add=new Operate();
				add.addItem();
				System.err.println("Press 5 to exit and any other digit to repeat");
			}
			else if(ch.equals("B")) {
				Operate remove=new Operate();
				remove.deleteItem();
				System.err.println("Press 5 to exit and any other digit to repeat");
			}
			else if(ch.equals("C")) {
				Operate modify=new Operate();
				modify.modifyItem();
				System.err.println("Press 5 to exit and any other digit to repeat");
			}
			else {
				System.err.println("enter a valid character!!");
				System.err.println("Press 5 to exit and any other digit to repeat");
			}
		}
		else if(input==4) {
			TotalBill bill=new TotalBill();
			bill.totalBill();
			System.err.println("Press 5 to exit and any other digit to repeat");
		}
		else {
			System.err.println("Enter valid characters...");
			System.err.println("Press 5 to exit and any other digit to repeat");
		}
		

	}

}
