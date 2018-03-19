package assignment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import oop.Student1;
public class PersonList {
	private Person[] list=null;
	private int count=0;
	public PersonList(int size) {
		if(size<10) size=10;
		list= new Person[size];
	}
	
	int find(String code) {
		for(int i=0;i<count;i++)
			if(code.equals(list[i].getCode())) return i;
		return -1;
	}
	
	public void add() {
		if(count == list.length) System.out.println("List is full!");
		else {
			String nCode, nName;
			int nAge;
			Scanner sc=new Scanner(System.in);
			int pos;
			do {
				System.out.println("Enter the person's code:");
				nCode=sc.nextLine().toUpperCase();
				pos=find(nCode);
				if(pos>=0) System.out.println("This code existed!");
				
			}
			while(pos>=0);
			System.out.println("Enter the person's name:");
			nName=sc.nextLine().toUpperCase();
			System.out.println("Enter the person's age:");
			nAge=Integer.parseInt(sc.nextLine());
            list[count++]=new Person(nCode, nName, nAge);
			System.out.println("New person has been added!");
			
		}
		
	}
    public void remove() {
		if (count==0) {
			System.out.println("The list is emty!");
			return;
		}
		String removeCode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the code of removed person: ");
		removeCode=sc.nextLine().toUpperCase();
		int pos=find(removeCode);
		if(pos<0) System.out.println("This person does not exist!");
		else {
			for(int i=pos; i<count-1;i++) list[i]=list[i+1];
			count--;
			System.out.println("The person "+ removeCode+" was removed!");
		}
	
	}
    public void update() {
		//code
		if(count==0) {System.out.println("Empty list!");
		return;
		}
		String code;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the code of updated person: ");
		code=sc.nextLine().toUpperCase();
		int pos=find(code);
		if(pos<0) System.out.println("This person does not exist!");
		else {
			 
			 String nName;
			 int nAge;
			 
			 System.out.println("Enter person's name: ");
			 nName=sc.nextLine().toUpperCase();
			 System.out.println("Enter person's age: ");
			 nAge=Integer.parseInt(sc.nextLine());
			 list[pos].setName(nName);
			 list[pos].setAge(nAge);
			 System.out.println("The person "+code+" was updated!");
 
			 
		}
	}
    
    public void print() {
		if(count==0)
		{
			System.out.println("Empty list!");
			return;
		}
		System.out.println("LIST OF PERSONS: ");
		for(int i=0;i<count;i++)
			System.out.println(list[i].toString());
	}

    void sort() {
    	if(count==0) return;
    	for(int i=0; i<count-1;i++)
    		for(int j=count-1;j>i;j--)
    			if(list[j].getAge()>list[j-1].getAge()) {
    				Person t=list[j];
    				list[j]=list[j-1];
    				list[j-1]=t;
    			}
    }
    
}

