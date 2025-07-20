package entities;

import services.SocialClassService;

public class Person {
	
	private String name;
	private Integer age;
	private Double money;

	
	public Person() {
		
	}


	public Person(String name, Integer age, Double money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	
	public String socialClass() {
		SocialClassService social = new SocialClassService();
		return social.socialClass(money);
	}
	
	
	//--------------------------------------------
	//GET AND SET

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Double getMoney() {
		return money;
	}


	public void setMoney(Double money) {
		this.money = money;
	}
	
	
	
	
	
	

}
