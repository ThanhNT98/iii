
package assignment;
import java.util.Scanner;
public class Person{
	private String code="", name="";
	private int age=0;
	
	public Person() {}
	public Person(String code, String name, int age) {
		this.code=code;
		this.name=name;
		this.age=age>0? age:0;
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's code: ");
		code=sc.nextLine();
		System.out.println("Enter person's name: ");
		name=sc.nextLine();
		System.out.println("Enter person's age: ");
		age=Integer.parseInt(sc.nextLine());
		
	}
	public String toString() {
		return "Code: "+ code+", "+"Name: "+name+", "+"Age: "+age;
	}
	
}