package application;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Person ps1 = new Person("Eduardo",18);
		
		System.out.println("Nome: " + ps1.getName() + ";" );
		System.out.println("Idade: " + ps1.getAge() + ";" );
		
		Person ps2 = new Person();
		ps2.setName("Edward");
		ps2.setAge(19);
		
		System.out.println("Nome: " + ps2.getName() + ";" );
		System.out.println("Idade: " + ps2.getAge() + ";" );
		

	}

}
