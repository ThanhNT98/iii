package assignment;

import java.util.Scanner;

import oop.Student1Manager;

public class PersonManager {
	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
		PersonList List=new PersonList(50);
		do {
			System.out.println("Select a function!");
			System.out.println("1.Add a new person");
			System.out.println("2.Remove a person");
			System.out.println("3.Uppdate a person");
			System.out.println("4.View a list");
			System.out.println("5.Exit");
			System.out.println("Select: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				List.add();
				break;
			case 2:
				List.remove();
				break;
			case 3:
				List.update();
				break;
			case 4:
				List.sort();
				List.print();
				break;
			
			
			}
		}
		while(choice>=1 && choice <5);
	}
	
}
