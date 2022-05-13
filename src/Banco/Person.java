package Banco;
import java.util.Scanner;

public class Person {
	String name;
	String cpf;
	String tel;
	int age;
	
	Person(String n, String c, String t, int i){
		name = n;
		cpf = c;
		tel = t;
		age = i;	
	}
	
	public String toString() {
		return "Person("+ name + ", CPF = " + cpf + ", Tel = " + tel + ", age = " + age + ")";
	}
	
	static Person read() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = s.nextLine();
		System.out.println("Tel: ");
		String tel = s.nextLine();
		System.out.println("CPF: ");
		String cpf = s.next();
		System.out.println("Age");
		int age = s.nextInt();
		s.nextLine();
		
		Person person = new Person(name, tel, cpf, age);
		
		return person;
	}
	public void update() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("----------------Current attributes:---------------- \n");
		System.out.print("Name: " + "Person.n\n");
		System.out.print("Tel: " + "Person.tel\n");
		System.out.print("Age: "+ "Person.age\n");
		
		System.out.print("Now insert the new attributes:\n");
		System.out.println("New name: ");
		name = s.nextLine();
		System.out.println("New tel: ");
		tel = s.nextLine();
		System.out.println("New age");
		age = s.nextInt();
		s.nextLine();
	}
}