package application;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Person ps1 = new Person("Eduardo",18, (double) 2000);
		
		System.out.println("Nome: " + ps1.getName() + ";" );
		System.out.println("Idade: " + ps1.getAge() + ";" );
		System.out.println("Social Class: " + ps1.socialClass()  + ";");
		
		Person ps2 = new Person();
		ps2.setName("Edward");
		ps2.setAge(19);
		ps2.setMoney((double) 1000000);
		
		System.out.println("Nome: " + ps2.getName() + ";" );
		System.out.println("Idade: " + ps2.getAge() + ";" );
		System.out.println("Social Class: " + ps2.socialClass()  + ";");
		

	}

}
