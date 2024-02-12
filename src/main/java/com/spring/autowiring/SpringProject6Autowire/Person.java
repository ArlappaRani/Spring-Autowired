package com.spring.autowiring.SpringProject6Autowire;

public class Person {
	
	Mobile mob;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Mobile mob) {
		super();
		System.out.println("Constructor got executed");
		this.mob = mob;
	}

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		System.out.println("Setter method got executed");
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [mob=" + mob + "]";
	}
	
	
	
	

}
