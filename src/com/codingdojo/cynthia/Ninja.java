package com.codingdojo.cynthia;

public class Ninja extends Human {
	
	//private int stealth = 10;

	public Ninja(String nombre) {
		super(nombre);
		this.stealth = 10;
	}
	
	public void steal(Human victima) {
		victima.health -= this.stealth;
		this.health += this.stealth;
		System.out.println(this.nombre+" le robó a "+victima.nombre);
		System.out.println(this.toString());
		System.out.println(victima.toString());
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println(this.nombre+" se escapó y ahora su salud es de "+this.health);
		System.out.println(this.toString());
	}
	
	
}
